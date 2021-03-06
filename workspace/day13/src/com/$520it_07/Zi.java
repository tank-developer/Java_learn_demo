package com.$520it_07;

public class Zi extends Fu {
	public static void get() {
		System.out.println("...zi static...");
	}
	
	public Zi() {
		//子类的构造方法第一行默认不是this()就是super()
//		super();//调用父类的无参构造
		//如果父类没有无参构造,则必须手动调用父类的构造方法
		super(5);
	}
	
	public Zi(int i) {
		this();
		this.i = i;
	}
	
	int i = 10;
//	重写父类的work方法
	@Override
	public void work() {
		System.out.println("..Zi..");
	}
	
	public void sub() {
		System.out.println("...sb...");
	}
	
}
