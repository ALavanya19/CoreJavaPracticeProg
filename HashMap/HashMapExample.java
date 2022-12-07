package com.HashMap;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create an hashmap
		HashMap hashmap=new HashMap();
		
		hashmap.put(1, "Aduri Nagabhushan");
		hashmap.put(2, "Aduri Sudhakara");
		hashmap.put(3, "Aduri Prabakara");
		hashmap.put(4, "Aduri Danavendra");
		hashmap.put(5, "Aduri Hanumappa");
		
		
		System.out.println(hashmap);
		
		//remove 2nd key
		hashmap.remove(2);
		System.out.println("After remove : "+hashmap);
		
		//get the value of 4th key
		System.out.println(hashmap.get(4));
		
		//check wheather key is availabel in hashmap or not
		System.out.println(hashmap.containsKey(3));
		
		//get the value of perticular id value
		System.out.println(hashmap.containsValue("Aduri Hanumappa"));
		
		//display all keys in hashmap
		
		System.out.println(hashmap.keySet());
		
		
	}

}
