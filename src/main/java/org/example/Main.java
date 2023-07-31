package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> fruitsQueue = new LinkedList<>();

        System.out.println("First task. Demonstration of the work of the add method");
        QueueUtil.initializeData(fruitsQueue);

        System.out.println("Initial data:");
        QueueUtil.printData(fruitsQueue);

        QueueUtil.updateData(fruitsQueue, "kiwi");

        System.out.println("\nUpdated data:");
        QueueUtil.printData(fruitsQueue);
    }


}
