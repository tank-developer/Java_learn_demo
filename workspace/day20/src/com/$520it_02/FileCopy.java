package com.$520it_02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class FileCopy {
	public static void main(String[] args) throws Exception {
		byCharStream("c:/1.java", "c:/2.java");
	}

	private static void byCharStream(String src, String dest) {
		//�������������
		Reader reader = null;
		Writer writer = null;
		try {
			reader = new FileReader(src);
			writer = new FileWriter(dest);
			
			char[] buf = new char[1024];
			int len;
			long s = System.currentTimeMillis();
			//�߶���д
			while ((len = reader.read(buf)) != -1) {
				writer.write(buf, 0, len);
			}
			long e = System.currentTimeMillis();
			System.out.println(e - s);
		} catch (Exception e) {
			//����ͳһ����,ת���쳣������
			throw new RuntimeException(e);
		} finally {
			//�ر���Դ
			try {
				//�ж��Ƿ��ж���
				if (reader != null) {
					reader.close();
				}
			} catch (Exception e) {
				throw new RuntimeException(e);
			} finally {
				try {
					if (writer != null) {
						writer.close();
					}
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
		}
	}
	
	private static void byByteStream(String src, String dest) {
		//try-with-resource
		try (
			InputStream is = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dest)
			) {
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
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	
}