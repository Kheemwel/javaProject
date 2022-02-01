package SampleCodes.DataStructures;

import java.util.PriorityQueue;

public class PriorityQueue_Sample {
    public static void main(String[] args) {
        PriorityQueue<Integer> printer = new PriorityQueue<>();
        printer.add(9);
        printer.add(7);
        printer.add(1);
        printer.add(3);
        while (!printer.isEmpty()) {
            System.out.print(printer.remove() + " ");
        }
    }
}
