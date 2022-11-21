package com.ktg.oops;

import java.util.Date;

//by default package for every java file is java.lang;
//by default parent class for every java class is java.lang.Object;
class Calculator {
	public void addOfTwo(int a, int b) {
		System.out.println("add of two numbers : " + (a + b));
	}
	public void subOfTwo(int a, int b) {
		System.out.println("sub of two numbers : " + (a - b));
	}
}
class Parent extends Calculator {
	public void sayHello() {
		System.out.println("hello everyone....");
	}
	public void printDate() {
		System.out.println("Toda's Date :" + new Date());
	}
}
public class Child extends Calculator {
	int age = 29;

	public int printAge() {
		return age;
	}

	public static void main(String[] args) {
		Child child = new Child();

		System.out.println(child.printAge());
		//child.printDate();
		//child.sayHello();
		child.subOfTwo(12,10);
		
//class,abstract class,interface,abstract method,concrete method....
	}

}
