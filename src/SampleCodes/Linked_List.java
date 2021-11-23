package SampleCodes;

import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("PLDT");
        list.add("Globe");
        list.add("Converge");
        list.add("Smart");
        list.add("DITO");

        list.addFirst("Sprint");
        list.addLast("Verizon");
        list.add(2, "HK Telecom");

        //remove
        //list.remove(5);
        //list.removeFirst();
        //list.removeLast();

        list.clear();

        if (list.contains("Smart"))
            System.out.println("Found");
        else
            System.out.println("item not found");

        System.out.println(list);

        System.out.println("The size of the list is: " + list.size());
        //System.out.println("The element is: " + list.get(0));
        System.out.println(list.isEmpty());

    }
}