package PrelimExam;

import static java.lang.System.out;

public class Num1 {
    static void showType(Integer x) {
        out.print("Integer");
    }

    static void showType(double x) {
        out.print("double");
    }

    static void showType(int x) {
        out.print("int");
    }

    static void showType(Double x) {
        out.print("double");
    }

    public static void main(String[] args) {
        showType(10);
        showType(10.0);
    }
}
