package collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

//collections can store both homogeneous/heterogeneous data	
//collections are not fixed in size /growable in nature
//lots of  utility methods	

//duplicates are not allowed
//insertion order is not followed
//java.util
public class SetEx {
	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<String>(new MyOrder());// 16//NSO java.lang.Comparable-->FI-->compareTo()
		names.add("sandeep");
		names.add("nikhila");							//CSO	java.util.Comparator-->FI-->compare
		names.add("afreen");
		names.add("rajesh");
		names.add("laxmi");
		names.add("afreen");
		System.out.println(names);

		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// --return -ve if obj1 has to come before obj2
		// --return +ve if obj1 has to come after obj2
		// -- return 0 if obj1 & obj2 are equal.
	}
}
class MyOrder implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
		//return -o1.compareTo(o2);
	}
	

}
