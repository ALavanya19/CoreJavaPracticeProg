package com.CollectionExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

public class InterviewQuestionsExamples {

	public static void main(String[] args) {
		
		//1a.Convert Array to ArrayList and 1b. ArrayList to Array
		//Create Array
		String[] ary=new String[5];
		ary[1]="ListInterface";
		ary[2]="SetInterfae";
		ary[3]="SetInterfae";
		ary[4]=null;
		
		//Create ArrayList
		ArrayList<String>arraylistex=new ArrayList<String>();
		arraylistex.add("ListInterfaceEx");
		arraylistex.add("SetInterfaceEx");
		arraylistex.add("MapInterfaceEx");
		arraylistex.add("MapInterfaceEx");
		// arraylistex.add(null);   //Throughs As NullPointerException
		
		/*System.out.println("Array List Items is : "+ary[1]+" "+ary[2]+" "+ary[3]+" ");
		System.out.println("ArrayList items is : "+arraylistex);
		
		//1a.convert array into arrayList
		System.out.println("After converting Array into ArrayList  items is : "+Arrays.asList(ary));
		//1b.convert arraylist into array
		arraylistex.toArray(new String[arraylistex.size()]);
		System.out.println("After converting ArrayList into Array  items is : "+arraylistex);
		
		//2.How to remove duplicates in ArrayList(Allows Duplicates)
		HashSet<String>duplicates=new HashSet<String>();
		//duplicates.add(null);
		//duplicates.add(null);
		
		//Copy arraylist items into hashset
		duplicates.addAll(arraylistex);
		System.out.println("Duplicate of ArrayList items is : "+duplicates);
		arraylistex.clear();
		arraylistex.addAll(duplicates);
		System.out.println("After Duplicates is removed list is : "+arraylistex);
		
		//3.Reverse Arraylist
		Collections.reverse(arraylistex);
		System.out.println("After reversing Array List is : "+arraylistex); */
	
		//4.Sort arraylist in desending order
		Comparator<String> c=Collections.reverseOrder();
		Iterator it=arraylistex.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
	}

}
