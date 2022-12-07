package com.BasicsExamples;

public class ReverseString {

	public static void main(String[] args) {
	
		//w3resources
		//37.Reverse String
		String word="The quick brown fox";
		String reverseString="";
		System.out.println("Original String is : "+word);
		for(int i=word.length()-1;i>=0;i--)
		{
		    char ch=word.charAt(i);
			reverseString=reverseString+ch;
		}

		System.out.println("Reverse String is : "+reverseString);
		
		//Reverse Integer number
		int num=324856234;
		int reverseNum = 0;
		
		System.out.println("Original Number is : "+num);
		System.out.print("Reverse Number is : ");
		while(num>0)
		{
			int rev=num%10;
			System.out.print(rev);
			num=num/10;
			
		}
		
		
		
		
	}

}
