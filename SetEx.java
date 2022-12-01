package collections;

import java.util.Iterator;
import java.util.TreeSet;

//collections can store both homogeneous/haterogeneous data	
//collections are not fixed in size /growable in nature
//lots of  utility methods	

//duplicates are not allowed
//insertion order is not followed
//java.util
public class SetEx {
	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<String>();// 16
		names.add("sandeep");
		names.add("nikhila");
		names.add("afreen");
		names.add("rajesh");
		names.add("laxmi");
		names.add("afreen");
		System.out.println(names);

		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
