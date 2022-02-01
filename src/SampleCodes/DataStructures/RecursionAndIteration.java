package SampleCodes.DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class RecursionAndIteration {
    static Scanner sc = new Scanner(System.in);

    static class IteratorClass {
        public static void main(String[] args) {
            ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1, 2, 3));
            Iterator<Integer> it = num.iterator();
            for (int x : num) {
                System.out.print(it.next());
            }
            System.out.println();
            Iterator<Integer> itt = num.iterator();
            while (itt.hasNext()) {
                System.out.print(itt.next());
            }
            System.out.println();
            Iterator<Integer> itti = num.iterator();
            while (itti.hasNext()) {
                Integer i = itti.next();
                System.out.print(i);
                if (i == 2) {
                    itti.remove();
                }
            }
            System.out.print(num);
        }
    }

    static class RestartLoop {
        public static void main(String[] args) {
            int a = 1;
            boolean loop = true;
            while (loop) {
                int n = 0;
                while (loop) {
                    System.out.println(a);
                    System.out.print("Enter 1: ");
                    n = sc.nextInt();
                    if (n != 1) {
                        a = 1;
                        break;
                    } else if (n == 0) {
                        loop = false;
                    }
                    a++;
                }
                if (n == 0) {
                    loop = false;
                }
            }
        }
    }

    static class LinearRecursion {
        static int factorial(int num) {
            if (num == 0) {
                return 1;
            } else {
                return num * factorial(num - 1);
            }
        }

        public static void main(String[] args) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.println("The factorial of " + num + " is " + factorial(num));
        }
    }

    static class TailRecursion {
        static int findGCD(int n1, int n2) {
            if ((n1 % n2) == 0) {
                return n2;
            } else {
                return findGCD(n2, (n1 % n2));
            }
        }

        public static void main(String[] args) {
            System.out.print("Enter the first number: ");
            int n1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            int n2 = sc.nextInt();
            System.out.println("The GCD of " + n1 + " and " + n2 + " is " + findGCD(n1, n2));
        }
    }

    static class BinaryRecursion {
        static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            } else {
                return fibonacci(n - 2) + fibonacci(n - 1);
            }
        }

        public static void main(String args[]) {
            System.out.print("Enter a number higher than 0: ");
            int num = sc.nextInt();
            System.out.print("Fibonacci Series of " + num + " numbers: ");
            for (int i = 0; i < num; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
    }

    static class MutualRecursion {
        static boolean isEven(int n) {
            if (n == 0) {
                return true;
            } else {
                return isOdd(n - 1);
            }
        }

        static boolean isOdd(int n) {
            if (n == 0) {
                return false;
            } else {
                return isEven(n - 1);
            }
        }

        public static void main(String[] args) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (isEven(num)) {
                System.out.print(num + " is an even number");
            } else {
                System.out.print(num + " is an odd number");
            }
        }
    }
}
