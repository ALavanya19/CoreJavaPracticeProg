package com.CollectionExample;

import java.util.Iterator;
import java.util.TreeSet;

public class BikeTreeSet {

	public static void main(String[] args) {
		
		//Create TreeSet
		//1.
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("TVS");
		ts.add("Honda");
		ts.add("Jupitor");
		
		System.out.println(ts);
		//2.iterate to all elements
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//4.reverse order of list
		
		Iterator it1=ts.descendingIterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
			
	
		
		
		
	}

}
