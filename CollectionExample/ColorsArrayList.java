package com.CollectionExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ColorsArrayList {

	public static void main(String[] args) {
		
		//Create ArrayList for Colors
		List<String>al=new ArrayList<String>();
		
		al.add("Green");
		al.add("Pink");
		al.add("Purple");
		al.add("Yellow");
		
		//Print the Colors List
		System.out.println("Before Colors List :"+al);
		Iterator it=al.iterator();
		
		/*while(it.hasNext())
		{
			System.out.println("Colors List:"+it.next());
		}*/
		
		/*for(Object e:al) {
			System.out.print("Before Colors List :"+e);
		}
         */
		al.add(0, "Red");
		System.out.println("After inserting element into first position: "+al);
		
		//Retrive and print 3rd element in the list
		System.out.println("3rd element in the list : "+al.get(2));
	    
		//Update 4th Index with Black color in list
		al.set(3,"Black");
	    System.out.println("After updating 4th element in the list:"+al);
	   
	    //remove 3rd element in the list
	    al.remove(2);
	    System.out.println("After removeing 3rd element in the list: "+al);
	    
	    //check Red is available in the list or not
	    if(al.contains("Red")) {
	    	System.out.println("Red is available in the list");	
	    }
	    else
	    {
	    	System.out.println("Red is not available in the list");
	    }
	    
	    //Sort the Array list
	    Collections.sort(al);
	    System.out.println("After Sorting list is :"+al);
	    
	    //Copy arryy list into another array list
	    List<String>al1=new ArrayList<String>();
	    
	    al1.addAll(al);
	    
	    System.out.println("Duplicate ArrayList:"+al1);
	    
	    //Shuffle the arraylist
	    Collections.shuffle(al);
	    Collections.shuffle(al1);
	    System.out.println("After shuffle Array List AL is :"+al);
	    System.out.println("After shuffle Array List AL1  is :"+al1);
	    
	    //Reverse Array List
	    Collections.reverse(al);
	    Collections.reverse(al1);
	    System.out.println("After Reverse Array List AL is :"+al);
	    System.out.println("After Reverse Array List AL1  is :"+al1);
	    
	    //Extract portion of ArrayList
	    System.out.println("Extract Portion of ArrayList " +al.subList(2, 4));
	    
	    //Compare two arraylist
	    List<String>al2=new ArrayList<String>();
	    for(String e:al)
	    {
	    	al2.add(al1.contains(e) ? "Yes" : "No");
	    	System.out.println("Compared ArrayList"+al2);
	    }
	    
	    //Swap two elements in ArrayList
	    Collections.swap(al1, 3, 2);
	    System.out.println(al1);
	    
	    //Remove one object 
	    al.remove(3);
	    System.out.println("After removeing Arraylist:"+al);
	    //remove all objects
	    
	    al.removeAll(al);
	    System.out.println("After removing all Objects in al is:"+al);
	    
	    System.out.println("Arraylist is empty "+al.isEmpty());
	    
	    
	}

}
