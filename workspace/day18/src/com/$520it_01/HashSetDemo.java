package com.$520it_01;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		//��������
		Set<User> set = new HashSet<>();
		User u1 = new User("�ڹѸ�", 30);
		User u3 = new User("�ڹѸ�", 30);
		User u2 = new User("�޽�˹", 130);
		
		set.add(u1);
		set.add(u2);
		set.add(u3);
		System.out.println(set);
		
		/*
		Set<Integer> set = new HashSet<>();
		set.add(100);
		set.add(100);
		set.add(100);
		set.add(100);
		System.out.println(set);
		
		Set<String> set = new HashSet<>();
	 	//����Ԫ��
		set.add("C");
		set.add("B");
		//�����ķ���ֵ��ʾ�����Ƿ����ӳɹ�
		System.out.println(set.add("A"));
		//���ܴ洢�ظ�Ԫ��
		System.out.println(set.add("B"));
		//Ԫ�ص�˳����ȫȡ���ڶ���Ĺ�ϣ��
		//��������ǲ����¼Ԫ�ص�����˳��
		System.out.println(set);
		 */
	}
}