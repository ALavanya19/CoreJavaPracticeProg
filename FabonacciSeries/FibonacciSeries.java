package com.FabonacciSeries;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int previous=0;
		int next=1;
		
		int max=10;
		
		for(int i=1;i<=max;i++)
		{
			  
			int fibonacci=previous+next;
			    next=previous;
			    previous=fibonacci;
			System.out.println(fibonacci);
			
		}
		
		
	}

}
