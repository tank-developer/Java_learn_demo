package com.$520it_03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceive {
	public static void main(String[] args) throws Exception {
//		1������DatagramSocket����
		DatagramSocket ds = new DatagramSocket(10086);
//		2������һ�����ݰ�   ����1:�����ֽ�����  ����2:����ĳ���
		DatagramPacket p = new DatagramPacket(new byte[1024], 1024);
//		3�����÷����������ݰ�
		ds.receive(p);//����
//		4���������ݰ�
//		��ȡIP
		String ip = p.getAddress().getHostAddress();
//		��ȡ��������
		byte[] buf = p.getData();
		//��ȡ���յĳ���
		int len = p.getLength();
		System.out.println(String.format("%s-->%s", ip, new String(buf, 0, len)));
//		5���ر���Դ�����ն�һ�㲻�رգ�
		ds.close();
	}
}