package com.ktg.oops;

import java.util.Date;

 class Parent2 {//final-->variable,method,class  
	int age = 29;
	public  void displayAge() {
		age = ++age;
		System.out.println(age);
	}
	public void displayDate() {

		System.out.println(new Date());
	}
}

public class MethodOverridingEx extends Parent2 {
//age=29
	public static void main(String[] args) {
		MethodOverridingEx obj = new MethodOverridingEx();
		Parent2 obj1=new Parent2();
		obj1.displayAge();//30
		obj1.displayDate();//complete date  with time
		obj.displayAge();//28
		obj.displayDate();//15th
	}
	@Override
	public void displayAge() {
		age = --age;
		System.out.println("overriding: "+age);
	}
	
}
