package com.$520it_04;

import java.io.File;
import java.io.RandomAccessFile;

public class RandomFile {
	public static void main(String[] args) throws Exception {
		File saveFile = new File("save1");
		//ר�ż�¼���ȵ���������ļ�,Ҫ��֤���ݴ洢���豸�ĵײ�
		RandomAccessFile save1 = new RandomAccessFile(saveFile, "rwd");
		
		File file = new File("c:/1.png");
		//��ȡ�ļ��Ĵ�С
		long fileLen = file.length();
		
		//�����������ר�Ŷ�ȡ����
		RandomAccessFile in = new RandomAccessFile(file, "r");
		RandomAccessFile out = new RandomAccessFile("c:/2.png", "rw");
		
		//���ļ����غ�Ĵ�С
		out.setLength(fileLen);
		
		//��ȡ�ļ�֮ǰ�ж��Ƿ��н���
		if (saveFile.length() != 0) {
			long i = save1.readLong();
			System.out.println(i);
			//�����ϴεĽ���
			in.seek(i);
			out.seek(i);
		}
		
		long pointer;
		while ((pointer = in.getFilePointer()) != fileLen) {
			//��ʼ��ȡ
			int data = in.read();
			out.write(data);
			//���½���
			save1.seek(0);
			save1.writeLong(pointer + 1);
		}
		
		in.close();
		out.close();
	}

	private static void work() throws Exception {
		//������������ļ�����
		RandomAccessFile file = new RandomAccessFile("c:/1.txt", "rw");
//		��ȡ�ļ�ָ��
		long index = file.getFilePointer();
		System.out.println("Ĭ��:" + index);
		
		//��д����
		file.writeBoolean(true);
		file.writeInt(100);
		
		index = file.getFilePointer();
		System.out.println("����:" + index);
		
		//�����ļ�ָ��
		file.seek(0);
		
		boolean b = file.readBoolean();
		System.out.println(b);
		int i = file.readInt();
		System.out.println(i);
		
		//�ر���Դ
		file.close();
	}
}