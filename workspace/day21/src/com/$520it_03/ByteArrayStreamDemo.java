package com.$520it_03;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayStreamDemo {
	public static void main(String[] args) throws Exception {
		input();
	}

	private static void input() {
		byte[] bs = {1,3,54,6,7,8,9};
		//���԰��ֽ����鵱��һ������ʹ��
		ByteArrayInputStream in = new ByteArrayInputStream(bs);
		int data;
		while ((data = in.read()) != -1) {
			System.out.println(data);
		}
	}

	private static void output() throws Exception {
		//�ֽ����������
		//ģ���кܶ�����
		String s1 = "����1";
		String s2 = "����2";
		String s3 = "����3";
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		//ģ���ȼ���һ��������
		out.write(s1.getBytes());
		System.out.println(out.toString());
		//������writer�����������ռ����ݵ�
		out.write(s2.getBytes());
		System.out.println(out.toString());
		out.write(s3.getBytes());
		//�ռ����������ͳһ����
		System.out.println(out.toString());
		//��ȡ���е��ֽ�����
		byte[] bs = out.toByteArray();
		System.out.println(Arrays.toString(bs));
	}
}