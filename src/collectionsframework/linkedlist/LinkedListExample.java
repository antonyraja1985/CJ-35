package collectionsframework.linkedlist;

import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(10);// 1 node
		ll.add(20);// 1 node
		ll.add(60);// 1 node
		ll.add(20);// 1 node
		ll.add(30);// 1 node
		ll.add(40);// 1 node
		System.out.println(ll);
		
		System.out.println(ll.get(5));
	}

}
