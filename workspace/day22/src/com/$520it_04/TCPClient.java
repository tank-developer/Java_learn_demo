package com.$520it_04;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
	public static void main(String[] args) throws Exception {
		//1:创建Socket对象
		//参数1:目标的IP  参数2:端口号
		Socket s = new Socket("192.168.36.10", 10086);
		//2:获取输出流
		OutputStream out = s.getOutputStream();
		out.write("hello TCP".getBytes());
		//告诉服务端数据发完了
		s.shutdownOutput();
		
		//读取服务端返回的数据
		InputStream in = s.getInputStream();
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) != -1) {
			System.out.println(new String(buf, 0, len));
		}
		
		//3:关闭资源
		s.close();
	}
}
