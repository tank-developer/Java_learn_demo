package com.$520it_01;

import java.io.FileReader;
import java.io.Reader;

public class ReaderDemo {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("c:/1.txt");
		//������
		read(reader);
		reader.close();
		/*
		InputStream is = new FileInputStream("c:/1.java");
		int i = is.read();
		System.out.println((char) i);
		is.close();	
		*/
	}

	private static void read(Reader reader) throws Exception {
		char[] buf = new char[5];
		//��ȡ���ݵ�����������
		int len;
		while ((len = reader.read(buf)) != -1) {
			//��Ҫȫ����ȥ,���˶����ö���
			System.out.println(new String(buf, 0, len));
		}
		/*
		int len = reader.read(buf);
		System.out.println(len);*/
		/*//��ȡ1���ַ�  �ɴ˿ɼ���ȡ���ı��ļ�ʹ���ַ���
		int data = reader.read();
		System.out.println((char)data);
		data = reader.read();
		System.out.println((char)data);
		data = reader.read();
		System.out.println((char)data);*/
	}
}