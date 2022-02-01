package OOP.Draft;

import java.time.LocalTime;
import java.util.Scanner;

interface Alarm {
    void setAlarm(String time);

    void showAlarm();
}

abstract class Weekday implements Alarm {

}

public class Monday extends Weekday {
    String time;

    @Override
    public void setAlarm(String time) {
        this.time = time;
    }

    @Override
    public void showAlarm() {
        LocalTime alarm = LocalTime.parse(time);
        LocalTime now = LocalTime.now();
        if (alarm.isAfter(now)) {
            System.out.println("I'll wake you up later!");
        } else if (alarm.isBefore(now)) {
            System.out.println("Alarm is set for tomorrow!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Monday monday = new Monday();
        System.out.print("Enter time for alarm in this format (HH:MM): ");
        monday.setAlarm(input.nextLine());
        monday.showAlarm();
    }
}
