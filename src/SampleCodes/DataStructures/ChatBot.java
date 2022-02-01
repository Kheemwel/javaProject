package SampleCodes.DataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ChatBot {
    public static void main(String args[]) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();
        Thread.sleep(2000);
        System.out.println("Nice to meet you, " + name + ". I'm Nika.");
        System.out.print("How are you today? ");
        Thread.sleep(2000);
        String feeling = input.nextLine();
        if (feeling.equalsIgnoreCase("good")) {
            System.out.println("Wow! I feel the same way.");
        } else if (feeling.equalsIgnoreCase("great")) {
            System.out.println("That's nice to know!");
        } else {
            System.out.println("Go ahead and do something you love.");
            Thread.sleep(2000);
            System.out.print("What is your favorite color? ");
            String fave = input.nextLine();
            ArrayList colors = new ArrayList();
            Collections.addAll(colors, "orange", "yellow", "purple");
            Collections.shuffle(colors);
            Thread.sleep(2000);
            System.out.println(fave + " is cool! Mine is " + colors.get(0) + ".");
        }
    }
}
