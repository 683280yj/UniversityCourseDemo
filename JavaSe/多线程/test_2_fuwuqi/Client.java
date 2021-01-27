package test_2_fuwuqi;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	private static final int PORT = 9191;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			InetAddress client = InetAddress.getByName("localhost");
			
			ServerSocket ss = new ServerSocket(PORT);
			Socket s = ss.accept();
			InputStream is = s.getInputStream();
			byte[] buffer = new byte[1024];			
			int len = is.read(buffer);	
			
			Socket s1 = new Socket(client, PORT);
			
			OutputStream os = s1.getOutputStream();
			System.out.print("请输入：");
			String msg = input.next();
			
			os.write(msg.getBytes());
			
			String msg1 = new String(buffer, 0, len);
			System.out.println("得到了服务器的消息："+msg1);
			
			s1.close();
			
			System.out.println("发送消息结束！");
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

}
