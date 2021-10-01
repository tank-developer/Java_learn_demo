package com.$520it_01;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) throws Exception {
		//ɾ���ļ�
		File file = new File("1.txt");
		//����ɾ��·��
//		System.out.println(file.delete());
		//��JVM�˳���ʱ��ɾ��,һ������ɾ����ʱ�ļ�
		file.deleteOnExit();
		
		System.out.println("ɾ�����");
	}

	private static void work4() {
		//��ȡ�ļ���������Ϣ
		File file = new File("c:/setup.exe");
		//��ȡ�ļ��Ĵ�С
		System.out.println(file.length());
		//��ȡ�ļ��ľ���·��
		//��ν����·�����Ǵ��̷���ʼ�ľ���ĵ�ַ
//		System.out.println(file.getAbsolutePath());
		//��ȡ���·��
//		System.out.println(file.getName());
		System.out.println(file.canExecute());
	}

	private static void work3() {
		//�ļ�������ж�
		File file = new File("c:/1");
		//�ж��ļ��Ƿ����
//		boolean b = file.exists();
		//�����жϷ�true����·�����ڵ�ǰ��,·�������ڷ���false
		//�ж����·�����ļ������ļ���
		boolean b = file.isFile();
		//�ж��Ƿ��ļ���
//		boolean b = file.isDirectory();
		System.out.println(b);
	}

	private static void work2() {
		//ʹ��Java�������ļ�
		File file = new File("c:/1/1.txt");
//		�����ļ���
		//�������Ƿ񴴽��ɹ�
		//ֻ�ܴ���1��,���ұ��븸·������
//		boolean b = file.mkdir();
		//���Դ����༶·��
//		boolean b = file.mkdirs();
		
		//���븸·�����ڲ���ʹ��,�����ļ�
//		boolean b = file.createNewFile();
//		System.out.println(b);
		
		//��file������ cjk.avi
		file.renameTo(new File("c:/1/cjk.avi"));
	}

	private static void work1() {
		//���췽��
		//�������ļ�/�ļ��е�·������
//		String path = "C:\\Intel\\Logs";
		String path = "C:/Intel";
		//File��ʵ���Ƕ�String��һ����װ������Ӳ���ϵ��ļ�
		File file = new File(path);
		//�ײ���д��toString����,��ֵ��ʱ���'/'���'\'
		System.out.println(file);
		//����1:��ʾ��·��   ����2:��ʾ��·��
		//�Ժ�׿�õ�
//		File file2 = new File(file, "Logs");
		File file2 = new File(path, "Logs");
		System.out.println(file2);
	}
}