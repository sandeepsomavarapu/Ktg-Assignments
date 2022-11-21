package com.ktg.string;

public class StringEx {

	public static void main(String[] args) {

		String orgname = "capgemini";// Immutable
		String orgname1 = "CApgemini";
		System.out.println(orgname.concat(" india"));
		String afterconcat = orgname.concat(" india");
		System.out.println(afterconcat);
			
		System.out.println(orgname.equalsIgnoreCase(orgname1));// true

		System.out.println(orgname == orgname1);// true

		System.out.println(orgname.compareToIgnoreCase(orgname1));// -1

		System.out.println(orgname.length());

		// --return -ve if obj1 has to come before obj2
		// --return +ve if obj1 has to come after obj2
		// -- return 0 if obj1 & obj2 are equal.

		String name = new String("ktgroup");
		String name1 = new String("ktgroup");

		System.out.println(name.equals(name1));// t

		System.out.println(name == name1);// false

		System.out.println(name.compareTo(name1));// 0

		
		StringBuilder sb=new StringBuilder("capgemini");
		sb.append(" USA");
		System.out.println(sb);
		
		StringBuilder sb1=new StringBuilder("capgemini");//muttable
	}

}

// t1 t2  t3
//					m1()
//System.out.println(orgname);