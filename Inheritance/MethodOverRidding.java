package com.Inheritance;

public class MethodOverRidding extends MethodOverriddinginheritance {
	
	
	public void method1() {
		int a=20;
		System.out.println("in Child class method1 "+a);
	}

	public static void main(String[] args) {
		
		MethodOverRidding m1=new MethodOverRidding();
		m1.method1();
	}
}
