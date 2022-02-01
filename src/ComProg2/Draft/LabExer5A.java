package ComProg2.Draft;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LabExer5A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 1;
        int max = 50;
        int randomizer = ((int) (Math.random() * (max + min)));
        int attempt = 1;
        boolean loop = true;

        while (loop) {
            try {
                System.out.println("Guess a number from 1 to 50!");
                while (loop) {
                    int num = input.nextInt();
                    if ((num >= min) && (num <= max)) {
                        if (num == randomizer) {
                            System.out.println("You got it in " + attempt + " attempt(s).");
                            loop = false;
                        } else if (num > randomizer) {
                            System.out.println("Too high.\tTry again.");
                            attempt += 1;
                        } else if (num < randomizer) {
                            System.out.println("Too low.\tTry again.");
                            attempt += 1;
                        }
                    } else if ((num < min) || (num > max)) {
                        throw new OutOfRangeException();
                    } else {
                        throw new InputMismatchException();
                    }
                }
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Invalid Input.");
                input.next();
            } catch (OutOfRangeException outOfRangeException) {
                System.out.println(outOfRangeException.getMessage());
            }
        }
    }

    static public class OutOfRangeException extends Exception {
        public OutOfRangeException() {
            super("Out of range.");
        }
    }
}