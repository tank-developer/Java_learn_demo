package com.$520it_01;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class AddComDemo {
	public static void main(String[] args) {
		//����һ������
		JFrame frame = new JFrame("Android");
		//���ô����λ�úʹ�С    ��������Ļ�����м�    500*300
		//��ȡ��Ļ�Ĵ�С
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension size = toolkit.getScreenSize();
		int width = size.width;
		int height = size.height;
		int x = (width - 500) / 2;
		int y = (height - 300) / 2;
		
		//ǰ��������ָ������Ļ������,�������Ǵ�С
		frame.setBounds(x, y, 500, 300);
		//����Ĭ�ϵĹرն���
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		work5(frame);

		//���ô���ɼ�
		frame.setVisible(true);
	}

	private static void work5(JFrame frame) {
		//���Զ�λ
//		��ղ��ֹ������������Զ�λ
		frame.setLayout(null);
		
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		//��ȷ˵�������λ�úʹ�С
		btn1.setBounds(190, 95, 200, 100);
		btn2.setBounds(180, 75, 150, 100);
		
		frame.add(btn1);
		frame.add(btn2);
	}

	private static void work4(JFrame frame) {
		//��һ�����װ��Box�����
		//ˮƽ��������
		Box box = Box.createHorizontalBox();
		//��ֱ����ĺ���
//		Box box = Box.createVerticalBox();
		
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		
		box.add(btn1);
		box.add(btn2);
		box.add(btn3);
		box.add(btn4);
		box.add(btn5);
		
		frame.add(box);
	}

	private static void work3(JFrame frame) {
		//��ʽ����  �����Ƕ���ķ�ʽ
		LayoutManager manager = new FlowLayout(FlowLayout.CENTER);
		frame.setLayout(manager);
		
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);
		frame.add(btn7);
		frame.add(btn8);
		frame.add(btn9);
	}

	private static void work2(JFrame frame) {
		//���񲼾�
		LayoutManager manager = new GridLayout(3, 3);
		//���ò��ֹ�����  ���Զ��ĵ����к���,ʹ�þ���ƽ��
		frame.setLayout(manager);
		
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);
		frame.add(btn7);
		frame.add(btn8);
		frame.add(btn9);
	}

	private static void work1(JFrame frame) {
		//����һ���߿򲼾�
		LayoutManager manager = new BorderLayout(3,3);
		//���ò��ֹ�����
		frame.setLayout(manager);
		
		JButton btn1 = new JButton("��");
		JButton btn2 = new JButton("��");
		JButton btn3 = new JButton("��");
		JButton btn4 = new JButton("��");
		JButton btn5 = new JButton("��");
		frame.add(btn1, BorderLayout.EAST);
		frame.add(btn2, BorderLayout.SOUTH);
		frame.add(btn3, BorderLayout.WEST);
		frame.add(btn4, BorderLayout.NORTH);
		frame.add(btn5, BorderLayout.CENTER);
	}
}