package com.$520it_01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class CopyFile {
	public static void main(String[] args) throws Exception {
		//�и�����,����ֻ�ܿ���1.java,���뿽����һ���ļ�ֻ���޸�Դ����
		//ֱ����Դ������д��,Ӳ����
		//Ҫ����򲻻�д��,��Ҫ�ѹؼ��ı�����ֵд�����������
		//�ڳ������е�ʱ��,ͨ��ʹ���������ݼ�ʱ��ȡ����
		//ʹ��properties�ļ� 
		Properties pro = new Properties();
		//������ȥ��ȡ���Ե�������Ϣ
		InputStream in = new FileInputStream("file.properties");
		pro.load(in);
		
		String src = pro.getProperty("src");//alt+shift+l
		InputStream is = new FileInputStream(src);
		String dest = pro.getProperty("dest");
		OutputStream out = new FileOutputStream(dest);
		
		int len;
		byte[] b = new byte[1024];
		while ((len = is.read(b)) != -1) {
			out.write(b, 0, len);
		}
		
		is.close();
		out.close();
	}
}