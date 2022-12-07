package com.ConstructorExmple;

public class StudentDetails {

	 String name;
	   int rollNo;
	   int className;
	
   public StudentDetails(String name,int rollNo, int className) {
	// TODO Auto-generated constructor stub
	   this.name=name;
	   this.rollNo=rollNo;
	   this.className=className;
	  
  }
   
   public void Display() {
	   
	   System.out.println(name+" "+rollNo+" "+className);
	   
   }
   
   public static void main(String[] args) {
	
	   StudentDetails student=new StudentDetails("Radha",30,2);
	   student.Display();
	   
  }
	
}
