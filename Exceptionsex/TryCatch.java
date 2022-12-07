package com.Exceptionsex;

public class TryCatch {

	public void addition(int a,int b)
	{
		int num1=a;
		int num2=b;
		int addition=num1+num2;
		System.out.println("Addition of two numbers is : "+addition);
		
	}
	public void division(int c,int d)
	{
		int num1=c;
		int num2=d;
		
		int division=c/d;
		
		throw new ArithmeticException("Number is divided by o");
		
	}
	
	public void multiplication(int x,int y)
	{
		int num1=x;
		int num2=y;
		int multiplication=num1*num2;
		System.out.println("Multiplication o ftwo numbers is : "+multiplication);
	}
	
	
	public static void main(String[] args) {
		
		TryCatch tc=new TryCatch();
		tc.addition(10, 0);
		tc.division(30, 0);
		try
		{
		tc.multiplication(30, 100);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
	}

}
