package com.$520it_02;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class NetCodeDemo {
	public static void main(String[] args) throws Exception {
		String info = "a�� ��_��";
		//�����ò���,���Ǵ����Ҫ�õ�		
		info = URLEncoder.encode(info, "utf-8");
		System.out.println(info);
		//�ַ�������ָ���Ǳ�����ֽ�,�������ָ�ı�����������ܴ�����ַ���
		info = URLDecoder.decode(info, "utf-8");
		System.out.println(info);
	}
}