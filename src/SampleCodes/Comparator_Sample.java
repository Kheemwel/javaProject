package SampleCodes;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Comparator_Sample {
    public static void main(String[] args) {
        Comparator<String> comp = Comparator.comparing(String::length);
        PriorityQueue<String> prio = new PriorityQueue<>(comp);
        prio.add("cat");
        prio.add("c");
        prio.add("cats");
        while (!prio.isEmpty()) {
            System.out.println(prio.remove());
        }
    }
}
