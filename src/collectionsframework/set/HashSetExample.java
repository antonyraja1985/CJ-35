package collectionsframework.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashSetExample {
	
	public static void main(String[] args) {
		
		
		HashSet set=new HashSet(16, 0.75f);
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(60);
		set.add(70);
		set.add(80);
		set.add(100);
		set.add(110);
		set.add(120);
		set.add(130);
		set.add(140);
		set.add(150);
		set.add(null);		
		System.out.println(set);
		
		
	}

}
