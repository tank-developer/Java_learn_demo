package com.$520it_05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStream {
	public static void main(String[] args) throws Exception {
		byCharStream();
	}

	private static void byCharStream() throws Exception {
		//�ַ�������
		BufferedReader reader = new BufferedReader(
				new FileReader("c:/1.java"));
		BufferedWriter writer = new BufferedWriter(
				new FileWriter("c:/2.java"));
		String data;
		long s = System.currentTimeMillis();
		//ֱ�Ӷ�ȡһ������
		while ((data = reader.readLine()) != null) {
//			System.out.println(data);
			writer.write(data);
			//дһ�����з�
			writer.newLine();
		}
		long e = System.currentTimeMillis();
		System.out.println(e - s);
		
		reader.close();
		writer.close();
	}

	private static void byByteStream() throws Exception {
		//��ͨ�ֽ��������ļ�ʹ��312
		//������ʹ��ʱ��112
		BufferedInputStream is = new BufferedInputStream(
				new FileInputStream("c:/setup.exe"));
		BufferedOutputStream out = new BufferedOutputStream(
				new FileOutputStream("c:/1.exe"));
		int len;
		byte[] buf = new byte[1024];
		long s = System.currentTimeMillis();
		//�ȶ�ȡ����,��д����
		while ((len = is.read(buf)) != -1) {
			//�߶���д
			out.write(buf, 0, len);
		}
		long e = System.currentTimeMillis();
		System.out.println(e - s);
		
		is.close();
		out.close();
	}
	
	
}