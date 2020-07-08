package java_day30_network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// 데몬 (요청이 들어올 때 까지 대기한다. listen)
public class ServerEx {

	BufferedReader in;
	BufferedWriter out;
	ServerSocket listener;
	Socket socket;
	Scanner scan = new Scanner(System.in);
	
	public ServerEx() {
		// 소켓 생성 -> 메세지 입력 => 서버 보내기
		try {
			listener = new ServerSocket(9999);
			System.out.println("서버가 연결을 기다리고 있습니다.....");
			socket = listener.accept();
			System.out.println("클라이언트와 연결되었습니다.");
			// socket에서 InputStream과 outputStream을 얻어와서 입출력을 준비한다.
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				// 클라이언트로부터 한 행 읽기
				String inputMessage = in.readLine();
				System.out.println("클라이언트 : " + inputMessage);
				System.out.print("서버 입력 : ");
				String outputMessage = scan.nextLine();
				if(outputMessage.equals("bye")) {
					System.out.println("연결을 종료합니다.");
					break;
				}
				out.write(outputMessage + "\n");
				out.flush();
			}
		} catch (IOException e) {
			System.out.println("서버 소켓 생성 에러 발생!");
			e.printStackTrace();
		} finally {
			try {
				if(scan != null) { scan.close(); }
				if(socket != null) { socket.close(); }
				if(listener != null) { listener.close(); }
			} catch (IOException e) {
				System.out.println("클라이언트와 채팅중 오류 발생");
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new ServerEx();

	}

}
