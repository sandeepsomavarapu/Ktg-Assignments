package collections;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapEx {
	public static void main(String[] args) {
		TreeMap<Integer, String> employees = new TreeMap<Integer, String>();// 16

		employees.put(123, "suresh");// entry
		employees.put(13, "naresh");
		employees.put(173, "rajesh");
		employees.put(23, "someesh");
		employees.put(1023, "mahesh");
		employees.put(4123, "sukesh");
		employees.put(123, "sandeep");

		System.out.println(employees);

		Set<Integer> keys = employees.keySet();

//		Iterator<Integer> itr = keys.iterator();
//
//		while (itr.hasNext()) {
//			int key = itr.next();
//			System.out.println(key + " " + employees.get(key));
//		}

		Set<Entry<Integer, String>> emps = employees.entrySet();
		Iterator<Entry<Integer, String>> itr1 = emps.iterator();

		while (itr1.hasNext()) {
			Entry<Integer, String> keyValue = itr1.next();
			System.out.println(keyValue.getKey() + " " + keyValue.getValue());
		}

	}
}
