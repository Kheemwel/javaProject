package SampleCodes.DataStructures;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_Sample {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        Collections.addAll(values, 1, 3, 2);
        Collections.sort(values);
        System.out.println(values);
    }
}
