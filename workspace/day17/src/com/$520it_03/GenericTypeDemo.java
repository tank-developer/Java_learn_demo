package com.$520it_03;

import java.util.ArrayList;
import java.util.List;

public class GenericTypeDemo {
	public static void main(String[] args) {
		//?��ʾδ֪������
//		List<?> list = new ArrayList<>();
//		list.add("1");���ܴ��κ�����,һ�������?������ʹ��
		List<Number> l1 = new ArrayList<>();
		l1.add(1);
		List<Integer> l2 = null;
		//�ڷ�������û�ж�̬�ĸ����
		work2(l1);
		
		Number num = work3(l1);
 	}
	
	private static void work2(List<? super Integer> list) {}
	private static void work1(List<? extends Number> list) {}

	private static <E> E work3(List<E> list) {
		return list.get(0);
	}

	private static void work() {
		//����ֻ��String
		List<String> list = new ArrayList<>();//�����﷨
//		List list = new ArrayList();
		list.add("123");
		list.add("haha");
		list.add("hehe");
		list.add("�ڹѸ�");
		System.out.println(list);
		System.out.println(list.get(0).length());
		
		for (String s : list) {
			System.out.println(s.length());
		}
	}
}