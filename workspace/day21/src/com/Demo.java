package com;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;

public class Demo {
	public static void main(String[] args) {
		//ͳ��һ���ַ�����ÿ���ַ����ֵĴ���
		//��:aabccc  -> a=2 b=1 c=3
		//�ӿ���̨��ȡ����,ֻ����cmd��ʹ��
		Console console = System.console();
//		String s = console.readLine();
		char[] ds = console.readPassword();
		
		//Map �ַ�key ����value
		char[] cs = ds;
		
		Map<Character, Integer> map = new HashMap<>();
		//key����->value+1  key������ value=1
		for (char c : cs) {
			if (map.containsKey(c)) {
				//����
				Integer num = map.get(c);
				map.put(c, num + 1);
			} else {
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
	}
}