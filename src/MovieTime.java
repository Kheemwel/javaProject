import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MovieTime {
    public static void main(String[] args) {
        Queue<String> movies = new LinkedList<>();
        Queue<String> snacks = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        //Kimwel Lourence C. Beller   BSIT 2.1A
        for (int m = 1; m <= 3; m++) {
            System.out.print("Enter movie " + m + " of 3: ");
            movies.offer(input.nextLine());
        }
        for (int s = 1; s <= 4; s++) {
            System.out.print("Enter snack " + s + " of 4: ");
            snacks.offer(input.nextLine());
        }
        System.out.println("Movies to watch are: " + movies);
        System.out.println("Snacks available are: " + snacks);
        System.out.println("Press S each time you finish a snack.");
        for (int e = 1; e <= 4; e++) {
            String eat = input.nextLine();
            if (eat.equals("S")) {
                snacks.poll();
                if (snacks.isEmpty()) {
                    System.out.println("No more snacks");
                } else {
                    System.out.println(snacks);
                }
            }
        }
    }
}
