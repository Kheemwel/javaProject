package DataStructures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import static java.lang.System.out;

public class TP_Midterm {
    public static void main(String[] args) {
        Stack<String> book_titles = new Stack<>();
        Queue<String> newbooks = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        out.println("Kimwel Lourence C. Beller\nBSIT 2.1A\n");

        out.println("Enter four book titles");
        for (int i = 1; i <= 4; i++) {
            out.print("Book " + i + ": ");
            book_titles.push(input.nextLine());
        }
        for (int i = 1; i <= 4; i++) {
            newbooks.offer(book_titles.pop());
        }
        out.print("New order of books:\n" + newbooks);
    }
}
