package com.$520it_05;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
/*//		boolean b = isTelNo(tel);
		//ƥ���Ƿ����ֻ�����
		//�ж�һ���ַ����Ƿ����ֻ�����
		String tel = "1571111111";
		//�������ʽ�õ��˾���Ϥ
//		���ĵ�
		String regex = "1[357]\\d{9}";
		boolean b = tel.matches(regex);
		System.out.println(b);
		
		String data = "gui;owlq;bnvh;iur";
		String regex = ";";
		String[] ss = data.split(regex);
		System.out.println(Arrays.toString(ss));*/
		
		String info = "Xxx���������,�����S  B";
		//����2:�滻��ʲô����
		info = info.replaceAll("[Ss].*[Bb]", "*");
		System.out.println(info);
	}

	private static boolean isTelNo(String tel) {
		//11λ   1��ͷ   ��������   �ڶ�λ��3/5/7
		if (tel.length() != 11) {
			return false;
		}
		if (!(tel.startsWith("13") || tel.startsWith("15") || tel.startsWith("17"))) {
			return false;
		}
		char[] cs = tel.toCharArray();
		for (char c : cs) {
			if (c > '9' || c < '0') {
				return false;
			}
		}
		return true;
	}
}