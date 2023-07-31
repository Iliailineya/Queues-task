package org.example;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

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
    public static void removeElements(Queue<String> queue, int elementsToRemove) {
        for (int i = 0; i < elementsToRemove; i++) {
            queue.poll();
        }
    }

    public static void removeElements(Queue<String> queue, String elementToRemove) {
        queue.remove(elementToRemove);
    }

    public static void printData(Queue<String> queue) {
        AtomicInteger count = new AtomicInteger(1);
        queue.forEach(fruit -> System.out.println(count.getAndIncrement() + ") " + fruit));
    }
}
