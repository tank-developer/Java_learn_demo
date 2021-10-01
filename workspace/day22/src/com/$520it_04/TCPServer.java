package com.$520it_04;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) throws Exception {
//		1������ServerSocket����
		//��������Ҫ�󶨵Ķ˿ں�
		ServerSocket ss = new ServerSocket(10086);
//		2�������˿�
		Socket s = ss.accept();
//		3����ȡ��������ȡ����
		InputStream in = s.getInputStream();
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) != -1) {
			System.out.println(new String(buf, 0, len));
		}
		//��Ӧ�ͻ������յ�������
		OutputStream out = s.getOutputStream();
		out.write("ok".getBytes());
		//���߿ͻ������ݷ�����
		s.shutdownOutput();
		
//		4���ر���Դ�������һ�㲻�رգ�
		s.close();
		ss.close();
	}
}