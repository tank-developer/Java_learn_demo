package com.$520it_01;

import java.net.InetAddress;

public class InetAddressDemo {
	public static void main(String[] args) throws Exception {
		//ͨ����̬�������ض���
		//������������
//		InetAddress address = InetAddress.getByName("Java-Bunny-PC");
		//����Ҳ������IP,���ǻ�ʧȥ����������
		InetAddress address = InetAddress.getByName("192.168.36.10");
		//����Ҳ����������
//		InetAddress address = InetAddress.getByName("www.baidu.com");
		//С��:����������������/����/IP
		//�������������ƺ�IP
//		System.out.println(address);
		//��ȡ����������
//		System.out.println(address.getHostName());
		//��ȡ������IP
		System.out.println(address.getHostAddress());
	}
}