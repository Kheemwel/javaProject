package SampleCodes.DataStructures;

import java.util.ArrayList;
import java.util.Collections;

public class MinHeap_Sample {
    public static void main(String[] args) {
        ArrayList<Integer> minheap = new ArrayList<>();
        Collections.addAll(minheap, 1, 7, 6, 8, 9);
        System.out.println(minheap.get(0));
    }
}
