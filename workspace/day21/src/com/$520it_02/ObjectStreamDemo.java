package com.$520it_02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {
	public static void main(String[] args) throws Exception {
		/*//���л�
		//ʹ�ö���������
		ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("c:/1.txt"));
		//д����
		//д�������ݲ��Ǹ��˿���,����������
		User u = new User("�޽�˹", 108);
		out.writeObject(u);
		//���ڴ��еĶ���д����Ӳ��-->���л�
		out.close();*/
		
		//�����л�
		ObjectInputStream is = new ObjectInputStream(
				new FileInputStream("c:/1.txt"));
		//��ȡ����
		Object obj = is.readObject();
		System.out.println(obj);
		is.close();
	}
}