package com.ktg.oops;

import java.util.Date;

interface I1 { // 100%
	// by default interface methods abstract

	void m1();// public abstract void m1();

	public abstract void m2();
}

abstract class Parent1 implements I1 {
	public void printDate() {
		System.out.println("Today's Date :" + new Date());
	}

	public abstract void printMessage();
}

public class Test extends Parent1 {
	public void m3() {
		System.out.println("Am from Test class.....");
	};

	public static void main(String[] args) {

	}

	public void printMessage() {
		System.out.println();
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

}
