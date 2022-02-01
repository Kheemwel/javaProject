package SampleCodes.DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Sample {
    public static void main(String[] args) {
        Queue beverages = new LinkedList();
        beverages.offer("Juice");
        beverages.offer("Iced Tea"); //enqueue Iced Tea without using add()
        System.out.println(beverages.peek() + " is queued first.");
        beverages.poll();
        System.out.println("Element(s) in the queue: " + beverages);
    }
}
