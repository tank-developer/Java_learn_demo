package com.$520it_01;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class JFrameDemo {
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

		//���ô���ɼ�
		frame.setVisible(true);
	}
}