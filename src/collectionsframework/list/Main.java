package collectionsframework.list;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
        // Creating ArrayLists
        ArrayList list1 = new ArrayList();
        list1.add(10);
        list1.add(20);
        list1.add(301);

        ArrayList list2 = new ArrayList();
        list2.add(300);
        list2.add(301);
        list2.add(302);

        // Retaining only the elements present in both lists
        list1.retainAll(list2);

        // Displaying the modified list1
        System.out.println("Modified list1: " + list1);
    }
}
