package com.ktg.oops;

public class MethodOverloading {
	public void add(int a, int b) {
		System.out.println("add of two int's :" + (a + b));
	}

	public void add(int a, int b, int c) {
		System.out.println("add of three int's :" + (a + b + c));
	}

	public void add(float a, float b, float c) {
		System.out.println("add of three float's :" + (a + b + c));
	}

	public void add(int a, float b) {
		System.out.println("add of int ,float :" + (a + b));
	}

	public void add(float a, int b) {
		System.out.println("add of float ,int :" + (a + b));
	}

	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.add(12, 13);
		obj.add(12.5f, 13);
		obj.add(12, 13.5f);
		obj.add(12,13, 14);
		obj.add(12.4f,23.5f,89.2f);
		obj.add('a','b');//type promotion 
	}

}
