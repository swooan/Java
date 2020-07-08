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
	
	// Ŭ���̾�Ʈ ��ü�� �޼����� �޵���(���Ʈĳ��Ʈ) �ϱ� ���ؼ� ���� �ʿ��ϴ�.
	static Hashtable<String, PrintWriter> map = new Hashtable<String, PrintWriter>();
	String userId;
	BufferedReader br;
	
	public ChatServer(String userId, BufferedReader br) {
		this.userId = userId;
		this.br = br;
		
		sendMessage(userId + "���� �����ϼ̽��ϴ�.");
	}
	
	void sendMessage(String line)  {
		// ���޹��� �޼����� ��� ���Ͽ� �ѷ��ش�.
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
//				ptw.write(userId + "���� �ӼӸ� : " + line.substring(line.lastIndexOf(":"+2)));
//				ptw.flush();
//			}
//		}
		String[] sp = line.split(" ");
		String id = sp[1];
		PrintWriter ptw = map.get(id);
		
		if(ptw != null) {
			ptw.write(userId + "���� �ӼӸ� : " + line.substring(4+id.length()+1));
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
					System.out.println("ä���� �����մϴ�.");
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
		// ���� - ServerSocket �ʿ� -> accept -> Socket�� ���´�.(Ŭ���̾�Ʈ�� ����� socket)
		BufferedReader br = null;
		ServerSocket serverSocket = null;
		try {
			 serverSocket = new ServerSocket(9999);
			System.out.println("Ŭ���̾�Ʈ ���� ��� ��....");
			while(true) {
				Socket socket = serverSocket.accept(); // Ŭ���̾�Ʈ�κ��� ������ ����
				System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�");				
				
				// Ŭ���̾�Ʈ�κ��� �޼��� �ޱ�
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String userId = br.readLine();
				System.out.println(userId + " ���� �����ϼ̽��ϴ�.");
				
				PrintWriter pw = new PrintWriter(new BufferedOutputStream(socket.getOutputStream()));
				pw.println(userId + "���� �����ϼ̽��ϴ�.");
				pw.flush();
				
				map.put(userId, pw);
				
				// ��ε� ĳ��Ʈ �غ�
				ChatServer server = new ChatServer(userId, br);
				server.start();
			}
		} catch (IOException e) {
			System.out.println("ä�� �� ���� �߻�");
		} 

	}

}
