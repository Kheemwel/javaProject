package SampleCodes;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomGenerator {
    static class MathRandom {
        public static void main(String[] args) {
            int min = 40;
            int max = 50;
            int randomizer = ((int) (Math.random() * (max + min))); //(0 -> 0.9) * 51
        }
    }

    static class RandomClass {
        public static void main(String[] args) {
            Random r = new Random();
            int randomizer = r.nextInt(50) + 1; // (0 -> 49) + 1
            r.ints(5).forEach(System.out::println);
            r.ints(50, 1, 51).forEach(System.out::println);
        }
    }

    static class SecureRandomClass {
        public static void main(String[] args) {
            SecureRandom s = new SecureRandom();
            int randomizer = s.nextInt(50) + 1; // (0 -> 49) + 1
        }
    }

    static class ThreadLocalRandomClass {
        public static void main(String[] args) {
            int randomizer = ThreadLocalRandom.current().nextInt(1, 51); // 1 - 50
        }
    }
}
