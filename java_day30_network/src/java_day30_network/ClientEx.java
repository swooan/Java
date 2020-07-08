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
				// ������ �� �� ������
				System.out.print("�޼��� �Է� : ");
				String outputMessage = scan.nextLine();
				if(outputMessage.equals("bye")) {
					System.out.println("������ �����մϴ�.");
					break;
				}
				out.write(outputMessage + "\n");
				out.flush();
				String inputMessage = in.readLine();
				System.out.println("���� : " + inputMessage);
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
				System.out.println("������ ä���� ������ �߻�");
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new ClientEx();
	}

}
