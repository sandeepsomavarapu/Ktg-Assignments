package collections;

import java.util.ArrayList;
import java.util.ListIterator;

//	collections can store both homogeneous/haterogeneous data	
//  collections are not fixed in size /growable in nature
//  lots of  utility methods	

//duplicates are allowed
//insertion order is followed
//java.util
public class ListEx {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();// 10,16,25 (cc*3/2)+1
		names.add("sandeep");
		names.add("nikhila");
		names.add("afreen");
		names.add("rajesh");
		names.add("laxmi");
		names.add("afreen");
		// names.add(1,"satish");
		// names.set(0,"mahesh");
		ListIterator<String> itr = names.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		System.out.println(names.lastIndexOf("afreen"));

		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("dell");
		names1.addAll(names);
		System.out.println(names1);
		names1.clear();// removeAll
		System.out.println(names1.containsAll(names));

	}

}
