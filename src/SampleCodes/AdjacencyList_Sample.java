package SampleCodes;

import java.util.ArrayList;

public class AdjacencyList_Sample {
    public static void main(String[] args) {
        ArrayList<ArrayList> adjlist = new ArrayList<>();
        char[] vertices = {'A', 'B', 'C', 'D', 'E'};

        int num = 5;
        for (int i = 0; i < num; i++) {
            adjlist.add(new ArrayList<>());
        }
        adjlist.get(0).add('B');
        adjlist.get(0).add('C');
        adjlist.get(1).add('A');
        adjlist.get(2).add('A');
        adjlist.get(2).add('D');
        adjlist.get(3).add('C');
        adjlist.get(3).add('E');
        adjlist.get(4).add('D');

        for (int i = 0, v = 0; i < num; i++, v++) {
            System.out.println(vertices[v] + ": " + adjlist.get(i));
        }
    }
}
