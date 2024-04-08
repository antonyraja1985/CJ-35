package threadsafe;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Creating two threads to concurrently add elements to the ArrayList
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                arrayList.add(i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                arrayList.add(i);
            }
        });

        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // At this point, the size of the ArrayList should ideally be 2000,
        // but due to concurrent modifications, it may not be the case.
        System.out.println("Size of ArrayList: " + arrayList.size());
    }
}

