package SampleCodes;

import java.util.Random;

public class Probability {
    static Random random = new Random();

    static boolean probability(int number) {
        return (Math.random() < ((double) number / 100));
    }

    static boolean probability1() {
        return (random.nextInt(100) == 1);
    }

    static boolean probability5() {
        return (random.nextInt(20) == 1);
    }

    static boolean probability10() {
        return (random.nextInt(10) == 1);
    }

    static boolean probability15() {
        return (random.nextInt(20) < 3);
    }

    static boolean probability25() {
        return (random.nextInt(4) == 1);
    }

    static boolean probability50() {
        return (random.nextInt(2) == 1);
    }

    static boolean probability75() {
        return (random.nextInt(4) != 0);
    }

    static boolean probability90() {
        return (random.nextInt(10) < 9);
    }

    static boolean probability99() {
        return (random.nextInt(100) != 0);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (probability(50)) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }
    }
}
