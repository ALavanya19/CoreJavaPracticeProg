package com.StringConcepts;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       //1. Length()  method 
		String name="Aduri Lavanya";
		
		//get the length of string and print the length
		int nameLength=name.length();
		System.out.println("The length of the String is : "+nameLength);
		
		
		//2.indexOf() method
		
		System.out.println(" index of : "+name.indexOf('L'));
		
		//charAt() method
		String characters=" ";
		for(int i=0;i<nameLength;i++)
		{
			characters=characters+name.charAt(i);
			
		}
		
		System.out.println(characters);
		
		
		//reverse the string
		
		String reverseString=" ";
		for(int i=nameLength-1;i>=0;i--)
		{
			reverseString=reverseString+name.charAt(i);
		}
		System.out.println(reverseString);
		
		//compare to strings
		String name1="Aduri";
		if(name.equals(name1))
		{
			System.out.println("equal");
			
		}
		else
		{
			System.out.println("Not equal");
		}
		
		//contains() not looks lower r upper it should be same 
		if(name.contains(name1))
		{
			System.out.println("contains");
			
		}
		else
		{
			System.out.println("not contains");
		}
		
		//toLowerCase & toUpperCase
		String lowercase=name.toLowerCase();
		System.out.println(lowercase);
		String uppercase=name.toUpperCase();
		System.out.println(uppercase);
		
		//equalsignorecase and compare to strings
		String name2="aduri lavanya";
		if(name.equalsIgnoreCase(name2))
		{
			System.out.println("Equals Ignore case: equal");
		}
		else
		{
			System.out.println("equals ignore case : not equal");
		}


		//perform substring() method
		System.out.println(name.substring(5));
	
	}
	

}
