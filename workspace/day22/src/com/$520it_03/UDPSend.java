package com.$520it_03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend {
	public static void main(String[] args) throws Exception {
//		1������DatagramSocket����
		DatagramSocket ds = new DatagramSocket();
//		2��׼�����ݣ�������ݰ�
		String data = "hello UDP";
		byte[] buf = data.getBytes();
		InetAddress address = InetAddress.getByName("localhost");
		int port = 10086;
		DatagramPacket p = new DatagramPacket(buf, buf.length, address, port);
//		3�����÷����������ݰ�
		ds.send(p);//ֻ�ܷ�,û�б�������ɹ���
//		4���ر���Դ
		ds.close();
	}
}