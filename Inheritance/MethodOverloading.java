package com.Inheritance;

public class MethodOverloading extends MethodOverloadinginheritance {

	public void method1(int a,int b) {
		
		int c=a+b;
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading m1=new MethodOverloading();
		m1.method1();
		m1.method1(10, 20);
		
		
	}

}
