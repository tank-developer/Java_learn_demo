package com.$520it_02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws Exception {
		//д��ȥ
		//1:����Ŀ��
		File file = new File("c:/1.txt"); 
		//2:�������������
		//�ļ���������ڻᴴ��
		//������췽��ÿ�ζ��ᴴ��һ���µ��ļ��Ѿ��ļ�������
		OutputStream out = new FileOutputStream(file); 
		//ʵ�����ݵ�׷��
//		OutputStream is = new FileOutputStream(file, true); 
		//3:д����
		write(out);
//		is.write(97);���±��򿪺󿴵�����a
//		is.write('h');
//		is.write('e');
//		is.write('l');
//		is.write('l');
//		is.write('o');
		//4:�ر���Դ
		out.close();
		out.write(10);
	}

	private static void write(OutputStream is) throws Exception {
		//�����ֽ���д���ݵķ���
//		��ϣ��ͬʱд��ABC
		byte[] b = {65, 66, 67};
		//�����ֽ����鶼��д��ȥ
//		is.write(b);
//		д�ֽ����ݵ�һ����
		//����2:��ʼλ��   ����3:д�ĸ���
		is.write(b, 0, 2);//��������
	}
}