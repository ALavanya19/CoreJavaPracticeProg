package com.CollectionExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CarsLinkedList {

	public static void main(String[] args) {
		
		//Linked List
		//1.Follows any Order
		//2.allows Duplications
		//3.Not synchronized
		//4.Linked List is a class and is coming from the List Interface
		//5.Objects/strings will store in the form of nodes
		//6.
		
		//Create Linked List
		LinkedList<String>car1=new LinkedList<String>();
		car1.add("Rolls Royce");
		car1.add("BMW");
		car1.add("Honda City");
		car1.add(3, "Range Rover");
		car1.addFirst("Mahindra");
		car1.addLast("MG");
		
		System.out.println("Car1 LinkedList is : "+car1);
		//2.Iterate through all elements
		Iterator it=car1.listIterator();
		System.out.println("Car1 List is ");
		for(String e:car1)
		{
			System.out.println(e);
		}
		
		//3Iterate elements with specific position
		Iterator it1=car1.listIterator(3);
		System.out.println("Iterate elements with specific position");
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
		//4.Linked List in reverse order
		Collections.reverse(car1);
		Iterator it2=car1.listIterator();
		System.out.println("Linked List in reverse order");
		while(it2.hasNext()) {
		System.out.println(it2.next());	
		}
		
		//System.out.println("Reverse order of car1 list is: "+car1);
		
		//5.Insert Specifi element in specific position
		car1.add(6, "Honda");
		System.out.println("After inserting specific element in car1 is : "+car1);
		
		
		//6.insert element in first and last position in list
		car1.addFirst("Benz");
		car1.addLast("Hyndai");
		System.out.println("After Inserting First and Last element in Linked List in car1 is : "+car1);
		
		//9.Insert some elements at specific postion into linked list
		List<String>CarColors=new LinkedList<String>();
		CarColors.add("BMW");
		CarColors.add(1, "MG");
		
		car1.addAll(CarColors);
		System.out.println("After inserting carcolors elements at specifc position into linked list is : "+car1);
		
		//10.get First and Last element in car1 List
		System.out.println(car1.getFirst());
		System.out.println(car1.getLast());
		
		//11. display the elements and its position
		for(int ele=0;ele<car1.size();ele++) {
			System.out.println("Car1 "+ele+" Elements is "+car1.get(ele));
		}
		
		//12.remove specific element in the list
		car1.remove(5);
		System.out.println("After removing 5th index Final car1 List is: "+car1);
		
		//13.remove fisrt and last element in car1 list
		car1.removeFirst();
		car1.removeLast();
		System.out.println("After removing First and Last elements in list is: "+car1);
		
		//14.remove all elements in linked list
		//car1.removeAll(car1);
		//System.out.println("After removing all Elements in car1 is: "+car1);
		
		//15.swap two elements in car1 list
		Collections.swap(car1, 4, 7);
		System.out.println("After swaping car1 is: "+car1);
		
		//16.shuffle the elements
		Collections.shuffle(car1);
		System.out.println("After Shuffling the car list is: "+car1);
		
		//19.retrive and remove first element in car1 list
		System.out.println(car1.pollFirst());
		System.out.println("After retrieve and remove first element in car1 is "+car1);
		
		//20.retrieve and not remove first element in car1 list
		System.out.println(car1.peekFirst());
		System.out.println("After retirvring and not remove first element in car1 is: "+car1);
		
		//21.retrieve and not remove last element
		System.out.println(car1.peekLast());
		System.out.println("After retrieveing last and not removed last element in car1 is :"+car1);
		
		//22.check element is exist in the list or not
		System.out.println(car1.contains("Yellow"));//false
		
		//23.convert linked list into array list
		//List<String>arraylist=new ArrayList<String>(car1);
		//System.out.println(arraylist);
		
		//24.Compare car1 and carcolor list
		LinkedList<String>compareresult=new LinkedList<String>();
		for(String e:CarColors)
		{
			compareresult.add(car1.contains(e) ? "Yes" : "No");
			System.out.println(compareresult);
		}
		
		//25.check car1 is empty or not
		System.out.println(car1.isEmpty()); //false
		
		//26.replace an element in car1 list
		car1.set(5, "Mahindra");
		System.out.println(car1);
	
		
	}
	

}
