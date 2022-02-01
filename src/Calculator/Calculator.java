package Calculator;

import java.util.Scanner;

import static java.lang.System.out;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        out.print("Input: ");
        String num = "1";
        out.println("Answer: " + Double.parseDouble(num));
    }
}
