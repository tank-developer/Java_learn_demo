package com.$520it_03;

import java.nio.charset.Charset;
import java.util.Arrays;

public class EncodeDecodeDemo {
	public static void main(String[] args) {
		//����  ���ַ����������ת�����ֽ�
		String s = "�޽�˹���ţX";
		//ʹ��Ĭ�ϵ��ַ�������  Ĭ�Ͼ���GBK
//		byte[] bs = s.getBytes();
		byte[] bs = s.getBytes(Charset.forName("gbk"));
//		byte[] bs = s.getBytes("utf-8");
		System.out.println(bs.length);
		//Ĭ�ϱ���/gbkÿ������2���ֽ�
		//utf-8ÿ��������3���ֽ�
		System.out.println(Arrays.toString(bs));
		
//		����  ���ֽ�ͨ��������������ַ�
		//���õ�utf-8�����,Ӧ��ʹ��utf-8������
//		System.out.println(new String(bs, "utf-8"));
		//ʹ��Ĭ��/gbk���н���
		System.out.println(new String(bs, Charset.forName("gbk")));
		//�ܽ�,Ҫ��ô������û������ --> ����ͽ���һ��
	}
}