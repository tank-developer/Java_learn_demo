package com.$520it_02;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class FileInputStreamDemo {
	public static void main(String[] args) throws Exception {
		//������
//		1:����Դ
		File file = new File("c:/1.txt");
//		2:��������������
		InputStream is = new FileInputStream(file);
//		3:������
		read(is);
//		4:�ر���Դ
		is.close();
	}

	private static void read(InputStream is) throws Exception {
		//���ж��Ĳ���
		//��ȡ�ֽڵ�����������
		byte[] b = new byte[3];
		int len;
		while ((len = is.read(b)) != -1) {
			//ʹ���ֽ�����ת����ַ���
//			System.out.println(new String(b));
			//�����ַ���ʹ�ö�ȡ�ĳ���
//			����2:��ʼλ��   ����3:ʹ�ø���
			System.out.println(new String(b, 0, len));
		}
		
		/*int i = is.read(b);
		System.out.println("��ȡ��" + i);//3��
		i = is.read(b);
		System.out.println("��ȡ��" + i);//2��
		i = is.read(b);
		System.out.println("��ȡ��" + i);//-1
		
		//��1���ֽ�
		int code = is.read();
		System.out.println((char)code);
		code = is.read();
		System.out.println((char)code);
		//�����ļ�ĩβ����-1 --> ������
		code = is.read();
		System.out.println(code);//-1
		
		//�Ż�ʹ��ѭ����ȡ1���ֽ�
		int code;//��¼ÿ�ζ�����������
		while ((code = is.read()) != -1) {
			System.out.println((char) code);
		}*/
		
	}
}