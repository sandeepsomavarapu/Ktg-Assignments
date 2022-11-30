package collections;

import java.util.ArrayList;

//	collections can store both homogeneous/haterogeneous data	
//  collections are not fixed in size /growable in nature
//  lots of  utility methods	

//duplicates are allowed
//insertion order is followed
//java.util
public class ListEx {

	public static void main(String[] args) {
	ArrayList names=new ArrayList();//10,16,25   (cc*3/2)+1
				names.add("mahesh");
				names.add(123);
				names.add(23.5);
				names.add(true);
				names.add("naresh");
		System.out.println(names);
	}

}
