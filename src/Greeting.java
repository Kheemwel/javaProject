import java.util.PriorityQueue;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        PriorityQueue<String> nicknames = new PriorityQueue<>();
        Scanner input = new Scanner(System.in);
        int classmates = 4;

        System.out.println("Enter the nickname of 4 of your classmates:");
        while (classmates > 0) {
            nicknames.add(input.nextLine());
            classmates--;
        }

        System.out.println("Press H to say Hi to each of them.");
        while (true) {
            String press = input.nextLine();
            if (!nicknames.isEmpty()) {
                if (press.equals("H")) {
                    System.out.println("Hi " + nicknames.remove());
                } else {
                    System.out.println("Hello " + nicknames.remove());
                }
            } else {
                System.out.println("Done saying Hi");
                break;
            }
        }
    }
}