package com.$520it_02;

//����Զ������Ҫ����������,ʵ��Comparable�ӿ�
public class Person implements Comparable<Person> {
	@Override
	public int compareTo(Person o) {
		//�鿴�ȽϵĹ���
		System.out.println(name + "-->" + o.name);
		/*
		         ����ֵ��3������
		         ����   ���ڶ���
		         ��       ���ڶ���
		         ����   С�ڶ���
		 */
		//�ȽϹ���,������������
		return age - o.age;
	}

	private String name;
	private int age;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}