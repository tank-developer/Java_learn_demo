package com.$520it_04;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ChangeStream {
	public static void main(String[] args) throws Exception  {
		/*//׼���������������ת��
		OutputStream out = new FileOutputStream("c:/2.txt");
		//������ֽ���ת�������ַ���
		Writer writer = new OutputStreamWriter(out, "utf-8");
		
		writer.write("С�����ţ");
		writer.close();*/
	
		InputStream is = new FileInputStream("c:/2.txt");
		Reader reader = new InputStreamReader(is, "utf-8");
		int read = reader.read();
		System.out.println((char) read);
		reader.close();
	}
}