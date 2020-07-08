package chatting;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Hashtable;
import java.util.Scanner;

public class ChatClient extends Thread {
	static Scanner scan = new Scanner(System.in);
	BufferedReader br;

	public ChatClient(BufferedReader br) {
		this.br = br;
	}

	@Override
	public void run() {

		while (true) {
			if (br != null) {
				try {
					String line = br.readLine();
					System.out.println(line);

				} catch (IOException e) {
//					e.printStackTrace();
					break;
				}
			}

		}

	}

	public static void main(String[] args) {

		BufferedReader br = null;

		// 클라이언트 - Socket 필요
		try {
			Socket socket = new Socket("127.0.0.1", 9999);
			System.out.println("채팅 서버에 연결 되었습니다.");

			PrintWriter pw = new PrintWriter(new BufferedOutputStream(socket.getOutputStream()));
			pw.println(args[0]);
			pw.flush();

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String inMessage = br.readLine();
			System.out.println(inMessage);

			// 메세지 수신 대기
			ChatClient client = new ChatClient(br);
			client.start();

			while (true) {
				String line = scan.nextLine();
				pw.println(line);
				pw.flush();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
