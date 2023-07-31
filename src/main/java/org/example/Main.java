package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> fruitsQueue = new LinkedList<>();

        System.out.println("\nFirst task. Demonstration of the work of the add method");
        QueueUtil.initializeData(fruitsQueue);

        System.out.println("Initial data:");
        QueueUtil.printData(fruitsQueue);

        QueueUtil.updateData(fruitsQueue, "kiwi");

        System.out.println("\nUpdated data:");
        QueueUtil.printData(fruitsQueue);

        fruitsQueue.clear();

        System.out.println("\nSecond task. Demonstration of the work of the remove method");
        QueueUtil.initializeData(fruitsQueue);

        System.out.println("Initial data:");
        QueueUtil.printData(fruitsQueue);

        QueueUtil.removeElements(fruitsQueue, "apricot");

        System.out.println("\nUpdated data:");
        QueueUtil.printData(fruitsQueue);
    }


}
