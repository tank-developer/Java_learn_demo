package com.$520it_03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("�޽�˹", "�����ӳ�");
		map.put("����", "����");
		map.put("����", "������");
		
		//��ȡmap������ӳ���ϵ
		Set<Entry<String, String>> entrys = map.entrySet();
		for (Entry<String, String> entry : entrys) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.format("key=%s,value=%s\n", key, value);
		}
		
		/*//ͨ���õ�����key
		Set<String> keys = map.keySet();
		for (String s : keys) {
			//ͨ��key��ȡvalue
			String val = map.get(s);
			System.out.format("%s=%s\n", s, val);
		}
		
		//ֱ�ӻ�ȡ���е�value
		Collection<String> vals = map.values();
		for (String s : vals) {
			System.out.println(s);
		}*/
	}

	private static void work() {
		/*//����ʾ��ϣ��
		Hashtable<String, String> table = new Hashtable<>();
		
		table.put("�޽�˹", "�����ӳ�");
		table.put("����", "������");
		
		//table�����м���Ԫ��?����ָ�����ж���ӳ���ϵ
		System.out.println(table.size());
		//key=value {����=������, �޽�˹=�����ӳ�}
		System.out.println(table);*/
		
		Map<String, String> map = new HashMap<>();
		map.put("�޽�˹", "�����ӳ�");
		map.put("��ң", "�����ӳ�");
		map.put("����", "������");
		
		/*
		//map�����ж���ӳ���ϵ
		System.out.println(map.size());
		//key=value {����=������, �޽�˹=�����ӳ�}
//		System.out.println(map);
		//����֪������Ľ�ɫ���� -->����key->value
		//����keyȥMap����value
		String value = map.get("����");
		System.out.println(value);
		boolean b = map.containsKey("����");
		System.out.println(b);
		//ɾ���޽�˹
		//����keyɾ��ӳ���ϵ
		map.remove("�޽�˹");
		 */
		//��key����,���滻����
//		map.put("�޽�˹", "�й��ӳ�");
		System.out.println(map);
	}
}