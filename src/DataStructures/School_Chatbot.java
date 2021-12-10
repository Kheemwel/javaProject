package DataStructures;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class School_Chatbot {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        String bot = "0_0: ";
        String you = "-_-: ";
        String chat;
        String[] options = {"Tuition Fee", "Enrollment", "Schedule", "About the School"};

        System.out.print(you);
        chat = input.nextLine();
        Thread.sleep(1000);
        if (!chat.isEmpty()) {
            System.out.print(bot + "Hi, Welcome. What is your name?\n" + you);
            String name = input.nextLine();
            Thread.sleep(1000);
            System.out.println(bot + "It's nice to meet you " + name + ". I'm Mimmy");
            Thread.sleep(2000);
            System.out.print(bot + "How can I help you? Is there anything you want to ask?\n" + Arrays.toString(options) + "\n" + you);
            String choice = input.nextLine();
            Thread.sleep(2000);
            if (choice.toLowerCase().contains(options[0].toLowerCase())) {
                System.out.print(bot + "The tuition fee is 10,000Php");
                Thread.sleep(1500);
                System.out.println(",but you can avail the 50% discount if you are one of the first 25 enrollees.");
                Thread.sleep(2500);
                System.out.println(bot + "So hurry up and enroll now as early as possible.");
            } else if (choice.toLowerCase().contains(options[1].toLowerCase())) {
                System.out.print(bot + "The day of enrollment will start on May 16, 2022 ");
                Thread.sleep(1500);
                System.out.println("and it will end on June 3, 2022.");
                Thread.sleep(2500);
                System.out.println(bot + "June 6, 2022 is the start of class, see you there.");
            } else if (choice.toLowerCase().contains(options[2].toLowerCase())) {
                System.out.println(bot + "The school is open at 8:00AM to 4:00PM every Monday to Friday.");
                Thread.sleep(2000);
                System.out.println(bot + "Unfortunately, we can only accept online transactions.");
                Thread.sleep(2000);
                System.out.println(bot + "Onsite transactions is prohibited for the meantime because of pandemic.");
            } else if (choice.toLowerCase().contains(options[3].toLowerCase())) {
                System.out.println("The name of the school is Veller's Highschool.");
                Thread.sleep(2000);
                System.out.println("Mr. Kheem Veller is the owner and the principal of the school.");
            } else {
                String[] answer = {"I'm sorry, I can't help you with that.", "I'm sorry, It seems I misunderstood you."};
                Collections.shuffle(Arrays.asList(answer));
                System.out.println(answer[0]);
            }
        }
    }
}
