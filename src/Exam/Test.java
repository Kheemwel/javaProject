package Exam;

import static java.lang.System.out;

public class Test {
    public static void change(int num) {
        num++;
        out.println(num);
    }

    public static void main(String[] args) {
        int i1 = 1;
        Test.change(i1);
        out.println(i1);
    }
}
