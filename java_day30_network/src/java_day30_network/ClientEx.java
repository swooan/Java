package java_day30_network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientEx {
	
	BufferedReader in;
	BufferedWriter out;
	ServerSocket listener;
	Socket socket;
	Scanner scan = new Scanner(System.in);
	
	public ClientEx() {
		try {
			socket = new Socket("localhost", 9999);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				// 서버로 한 행 보내기
				System.out.print("메세지 입력 : ");
				String outputMessage = scan.nextLine();
				if(outputMessage.equals("bye")) {
					System.out.println("연결을 종료합니다.");
					break;
				}
				out.write(outputMessage + "\n");
				out.flush();
				String inputMessage = in.readLine();
				System.out.println("서버 : " + inputMessage);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(scan != null) scan.close();
				if(socket != null) socket.close();
			} catch (IOException e) {
				System.out.println("서버와 채팅중 오류가 발생");
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new ClientEx();
	}

}
