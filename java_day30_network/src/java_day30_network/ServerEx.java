package java_day30_network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// ���� (��û�� ���� �� ���� ����Ѵ�. listen)
public class ServerEx {

	BufferedReader in;
	BufferedWriter out;
	ServerSocket listener;
	Socket socket;
	Scanner scan = new Scanner(System.in);
	
	public ServerEx() {
		// ���� ���� -> �޼��� �Է� => ���� ������
		try {
			listener = new ServerSocket(9999);
			System.out.println("������ ������ ��ٸ��� �ֽ��ϴ�.....");
			socket = listener.accept();
			System.out.println("Ŭ���̾�Ʈ�� ����Ǿ����ϴ�.");
			// socket���� InputStream�� outputStream�� ���ͼ� ������� �غ��Ѵ�.
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				// Ŭ���̾�Ʈ�κ��� �� �� �б�
				String inputMessage = in.readLine();
				System.out.println("Ŭ���̾�Ʈ : " + inputMessage);
				System.out.print("���� �Է� : ");
				String outputMessage = scan.nextLine();
				if(outputMessage.equals("bye")) {
					System.out.println("������ �����մϴ�.");
					break;
				}
				out.write(outputMessage + "\n");
				out.flush();
			}
		} catch (IOException e) {
			System.out.println("���� ���� ���� ���� �߻�!");
			e.printStackTrace();
		} finally {
			try {
				if(scan != null) { scan.close(); }
				if(socket != null) { socket.close(); }
				if(listener != null) { listener.close(); }
			} catch (IOException e) {
				System.out.println("Ŭ���̾�Ʈ�� ä���� ���� �߻�");
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new ServerEx();

	}

}
