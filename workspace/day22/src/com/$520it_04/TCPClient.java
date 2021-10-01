package com.$520it_04;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
	public static void main(String[] args) throws Exception {
		//1:����Socket����
		//����1:Ŀ���IP  ����2:�˿ں�
		Socket s = new Socket("192.168.36.10", 10086);
		//2:��ȡ�����
		OutputStream out = s.getOutputStream();
		out.write("hello TCP".getBytes());
		//���߷�������ݷ�����
		s.shutdownOutput();
		
		//��ȡ����˷��ص�����
		InputStream in = s.getInputStream();
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) != -1) {
			System.out.println(new String(buf, 0, len));
		}
		
		//3:�ر���Դ
		s.close();
	}
}