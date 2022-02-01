package ComProg2;

import java.util.Scanner;

public class LabExer1B {
    private int num;

    public static void main(String[] args) {
        LabExer1B labExer1B = new LabExer1B();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        labExer1B.setNum(input.nextInt());
        labExer1B.showNumberPlus10();
        labExer1B.showNumberPlus100();
        labExer1B.showNumberPlus1000();
    }

    public void showNumberPlus10() {
        System.out.println(getNum() + " plus 10 is " + (getNum() + 10));
    }

    public void showNumberPlus100() {
        System.out.println(getNum() + " plus 100 is " + (getNum() + 100));
    }

    public void showNumberPlus1000() {
        System.out.println(getNum() + " plus 1000 is " + (getNum() + 1000));
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
