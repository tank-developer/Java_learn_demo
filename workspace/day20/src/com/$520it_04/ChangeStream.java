package com.$520it_04;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ChangeStream {
	public static void main(String[] args) throws Exception  {
		/*//准备好输出流让他来转换
		OutputStream out = new FileOutputStream("c:/2.txt");
		//把输出字节流转变成输出字符流
		Writer writer = new OutputStreamWriter(out, "utf-8");
		
		writer.write("小码哥真牛");
		writer.close();*/
	
		InputStream is = new FileInputStream("c:/2.txt");
		Reader reader = new InputStreamReader(is, "utf-8");
		int read = reader.read();
		System.out.println((char) read);
		reader.close();
	}
}
