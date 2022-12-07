package com.CollectionExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class BusHashSet {

	public static void main(String[] args) {
		
		//1.HashSet is a Class and is Coming from the Set Interface
		//2.Hashset represents the Hash Table
		//3.HashSet is not follow order
		//4.Hashset is non allows duplicates
		
		//1.Create HashSet and Add Elements into HashSet
		HashSet<String>bus1=new HashSet<String>();
		bus1.add("Palle Vellugu");
		bus1.add("Express");
		bus1.add("Super Luxury");
		bus1.add("Express");
		System.out.println(bus1);

		//2.iterate to all elements
		Iterator it=bus1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//3.get the number of elements in bus1 set
		System.out.println("No.of elements in the bus1 list: "+bus1.size());
		
		//4.Empty bus1 set
		//bus1.removeAll(bus1);
		//System.out.println("Bus1 Set is : "+bus1);
		
		//5.Check bus1 is empty or not
		System.out.println(bus1.isEmpty());
		
		//7.Convert HashSet into ArrayList
		String[] arraylist=new String[bus1.size()];
		bus1.toArray(arraylist);
		System.out.println(arraylist);
		
		//9.Convert HashSet into ArrayLost
		List<String>arraylist1=new ArrayList<String>(bus1);
		System.out.println(arraylist1);
		
	}

}
