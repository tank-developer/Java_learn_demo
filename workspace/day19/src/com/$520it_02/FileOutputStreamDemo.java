package com.$520it_02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws Exception {
		//写出去
		//1:定义目标
		File file = new File("c:/1.txt"); 
		//2:创建输出流对象
		//文件如果不存在会创建
		//这个构造方法每次都会创建一个新的文件把旧文件给覆盖
		OutputStream out = new FileOutputStream(file); 
		//实现数据的追加
//		OutputStream is = new FileOutputStream(file, true); 
		//3:写操作
		write(out);
//		is.write(97);记事本打开后看到的是a
//		is.write('h');
//		is.write('e');
//		is.write('l');
//		is.write('l');
//		is.write('o');
		//4:关闭资源
		out.close();
		out.write(10);
	}

	private static void write(OutputStream is) throws Exception {
		//操作字节流写数据的方法
//		我希望同时写出ABC
		byte[] b = {65, 66, 67};
		//整个字节数组都会写出去
//		is.write(b);
//		写字节数据的一部分
		//参数2:起始位置   参数3:写的个数
		is.write(b, 0, 2);//必须掌握
	}
}
