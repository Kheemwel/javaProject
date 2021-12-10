package DataStructures;

import java.util.Scanner;
import java.util.Stack;

public class FruitBasket {
    public static void main(String[] args) {
        Stack<String> basket = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Catch and eat any of these fruits:('apple', 'orange', 'mango', 'guava')");
        System.out.print("How many fruits would you like to catch? ");
        int num = sc.nextInt();
        System.out.println("Choose a fruit to catch. Press A, O, M, or G.");

        for (int i = 1; i <= num; i++) {
            System.out.print("Fruit " + i + " of " + num + ": ");
            String input = sc.next();
            if (input.equalsIgnoreCase("A")) {
                basket.push("apple");
            } else if (input.equalsIgnoreCase("O")) {
                basket.push("orange");
            } else if (input.equalsIgnoreCase("M")) {
                basket.push("mango");
            } else if (input.equalsIgnoreCase("G")) {
                basket.push("guava");
            }
        }

        System.out.println("Your basket now has: " + basket);
        while (!basket.isEmpty()) {
            System.out.print("Press E to eat fruit. ");
            String e = sc.next();
            if (e.equalsIgnoreCase("E")) {
                basket.pop();
                if (basket.isEmpty()) {
                    System.out.println("No more fruits");
                } else {
                    System.out.println("Fruit(s) in the basket: " + basket);
                }
            }
        }
    }
}
