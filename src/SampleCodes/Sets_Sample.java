package SampleCodes;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Sets_Sample {
    public static void main(String[] args) {
        Set<String> a = new HashSet<>();
        Set<String> b = new HashSet<>();
        Collections.addAll(a, "Mark", "Nika", "Mairo", "Kae");
        Collections.addAll(b, "John", "Marco", "Mark");
        Set<String> union = new HashSet<>(a);
        Set<String> inter = new HashSet<>(a);
        Set<String> diff = new HashSet<>(a);
        union.addAll(b);
        inter.retainAll(b);
        diff.removeAll(b);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + inter);
        System.out.println("Difference: " + diff);
        System.out.println("Is set a subset of set b: " + (a.containsAll(b)));
    }
}
