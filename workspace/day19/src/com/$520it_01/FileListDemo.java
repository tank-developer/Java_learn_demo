package com.$520it_01;

import java.io.File;
import java.io.FileFilter;

public class FileListDemo {
	public static void main(String[] args) {
		//���������е�java�ļ�
		File file = new File("E:/");
		//����һ���ļ�������
		File[] files = file.listFiles(/*new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				//���˵Ĳ����ǵ�ǰ���ļ�
				//����:ֻҪjava���ļ�
				boolean b = pathname.getName().endsWith("java");
				//����ֵ��ʾ�Ƿ���Ҫ����,true��ʾ��Ҫ����
				return b;
			}
		}*/);
		System.out.println("----------------");
		for (File f : files) {
			System.out.println(f.listFiles());
		}
	}

	private static void work() {
		//��ȡ���еĸ�·��
		File[] files = File.listRoots();
		for (File f : files) {
			System.out.println(f);
		}
		
//		File file = new File("E:/��ң/day01-�߽�java");
		File file = new File("d:/");
		//��ȡĿ¼�����е�·��
//		searchFiles(file);
		
		/*File[] files = file.listFiles();
		for (File f : files) {
			System.out.println(f);
			if (f.isDirectory()) {
				File[] listFiles = f.listFiles();
				for (File f1 : listFiles) {
					System.out.println(f1);
					if (f.isDirectory()) {
						File[] listFiles1 = f.listFiles();
						for (File f2 : listFiles1) {
							System.out.println(f2);
						}
					}
				}
			}
		}
		
		String[] paths = file.list();
		for (String path : paths) {
			System.out.println(path);
		}*/
	}
	
	private static void searchFiles(File file) {
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			if (files != null) {
				for (File f : files) {
					//�����
					System.out.println(f);
					if (f.isDirectory()) {
						//�ظ�������߼�,��Щ�߼����������������?
					}
				}
			}
		}
	} 
}