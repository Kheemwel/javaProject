package SampleCodes.DataStructures;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_Sample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("How many elements do you want to add? ");
        int num = input.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print("Add element: ");
            String element = input.next();
            list.add(element);
        }
        System.out.println();
        System.out.println("LinkedList elements are: ");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
        System.out.println("The size of list is " + list.size());

    }
}
