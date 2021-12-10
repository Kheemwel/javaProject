package DataStructures;

import java.util.ArrayList;

public class AdjacencyList {
    public static void main(String[] args) {
        System.out.println("Kimwel Lourence C. Beller\nBSIT 2.1A\n");

        ArrayList<ArrayList> adjacency_list = new ArrayList<>();
        char[] vertices = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int numOfVertices = vertices.length;
        for (int i = 0; i < numOfVertices; i++) {
            adjacency_list.add(new ArrayList<>());
        }
        adjacency_list.get(0).add('B');
        adjacency_list.get(1).add('A');
        adjacency_list.get(1).add('C');
        adjacency_list.get(2).add('B');
        adjacency_list.get(2).add('D');
        adjacency_list.get(2).add('E');
        adjacency_list.get(3).add('C');
        adjacency_list.get(3).add('E');
        adjacency_list.get(3).add('F');
        adjacency_list.get(3).add('G');
        adjacency_list.get(4).add('C');
        adjacency_list.get(4).add('D');
        adjacency_list.get(4).add('F');
        adjacency_list.get(5).add('D');
        adjacency_list.get(5).add('E');
        adjacency_list.get(6).add('D');
        for (int i = 0, v = 0; i < numOfVertices; i++, v++) {
            System.out.println(vertices[v] + ": " + adjacency_list.get(i));
        }
    }
}
