package chatting;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Enumeration;
import java.util.Hashtable;

public class ChatServer extends Thread {
	
	// 클라이언트 전체가 메세지를 받도록(브로트캐스트) 하기 위해서 맵이 필요하다.
	static Hashtable<String, PrintWriter> map = new Hashtable<String, PrintWriter>();
	String userId;
	BufferedReader br;
	
	public ChatServer(String userId, BufferedReader br) {
		this.userId = userId;
		this.br = br;
		
		sendMessage(userId + "님이 입장하셨습니다.");
	}
	
	void sendMessage(String line)  {
		// 전달받은 메세지를 모든 소켓에 뿌려준다.
		Enumeration<String> keys = map.keys();
		
		while(keys.hasMoreElements()) {
			String idkey = keys.nextElement();
			PrintWriter pw = map.get(idkey);
			pw.println(userId + " : " + line);
			pw.flush();
		}
		
	}
	
	void quit(String line) {
		
	}

	void whisper(String line) throws IOException {
//		int begin = line.indexOf(" ") + 1;
//		int end = line.indexOf(" ",begin);
				
//		if(end != -1) {
//			String id = line.substring(begin,end);
//			int endid = line.indexOf(id);
//			String whisper = line.substring(end+1);
//			PrintWriter ptw = map.get(id);
//			
//			if(ptw != null) {
//				ptw.write(userId + "님의 귓속말 : " + line.substring(line.lastIndexOf(":"+2)));
//				ptw.flush();
//			}
//		}
		String[] sp = line.split(" ");
		String id = sp[1];
		PrintWriter ptw = map.get(id);
		
		if(ptw != null) {
			ptw.write(userId + "님의 귓속말 : " + line.substring(4+id.length()+1));
			ptw.flush();
			ptw.flush();
		}
	}
	
	
	
	@Override
	public void run() {
		while(true) {
			try {
				String line = br.readLine();
				if(line.equals("/quit")) {
					System.out.println("채팅을 종료합니다.");
					break;
				}
				else if(line.indexOf("/to") > -1) {
					whisper(line);
				}
				else {
					sendMessage(line);
				}
			} catch (IOException e) {
//				e.printStackTrace();
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		// 서버 - ServerSocket 필요 -> accept -> Socket이 나온다.(클라이언트가 연결된 socket)
		BufferedReader br = null;
		ServerSocket serverSocket = null;
		try {
			 serverSocket = new ServerSocket(9999);
			System.out.println("클라이언트 연결 대기 중....");
			while(true) {
				Socket socket = serverSocket.accept(); // 클라이언트로부터 소켓이 들어옴
				System.out.println("클라이언트 연결 완료");				
				
				// 클라이언트로부터 메세지 받기
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String userId = br.readLine();
				System.out.println(userId + " 님이 접속하셨습니다.");
				
				PrintWriter pw = new PrintWriter(new BufferedOutputStream(socket.getOutputStream()));
				pw.println(userId + "님이 입장하셨습니다.");
				pw.flush();
				
				map.put(userId, pw);
				
				// 브로드 캐스트 준비
				ChatServer server = new ChatServer(userId, br);
				server.start();
			}
		} catch (IOException e) {
			System.out.println("채팅 중 오류 발생");
		} 

	}

}
