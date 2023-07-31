package org.example;

import java.util.Queue;

public class QueueUtil {
    public static void initializeData(Queue<String> queue) {
        queue.offer("apricot");
        queue.offer("mango");
        queue.offer("cherry");
        queue.offer("rice");
    }

    public static void updateData(Queue<String> queue, String newElement) {
        queue.offer(newElement);
    }

    public static void printData(Queue<String> queue) {
        int count = 1;
        for (String element : queue) {
            System.out.println(count + ") " + element);
            count++;
        }
    }
}
