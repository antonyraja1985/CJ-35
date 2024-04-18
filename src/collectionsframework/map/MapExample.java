package collectionsframework.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap();
		
		map.put(101, "antony"); //one entry(key-value pair)
		map.put(102, "Raja"); //one entry(key-value pair)
		map.put(103, "Smith"); //one entry(key-value pair)
		map.put(104, "John"); //one entry(key-value pair)
		map.put(104, "James"); //one entry(key-value pair)
		map.put(105, "John"); //one entry(key-value pair)
		//map.put("Vijay",106);
		System.out.println(map); //one entry(key-value pair)
		
		System.out.println(map.get(101));
		System.out.println(map.remove(105));
		
		System.out.println(map);
		
        Map<String,Integer> mapOne=new HashMap();
		
        mapOne.put("antony", 101); //one entry(key-value pair)
        mapOne.put("Raja",102); //one entry(key-value pair)
        mapOne.put("Smith", 103); //one entry(key-value pair)
        mapOne.put("John", 104); //one entry(key-value pair)
        mapOne.put("James", 105); //one entry(key-value pair)
        mapOne.put("John", 106); //one entry(key-value pair)
        mapOne.put("Vijay",106);
        System.out.println(mapOne);
	}

}
