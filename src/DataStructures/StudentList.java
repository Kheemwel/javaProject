package DataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, String> students = new HashMap<>(); //step 4
        int count = 3;
        String[] keys = new String[count];
        String student_number, first_name;

        for (int i = 1; i <= count; i++) { //step 5.1
            System.out.print(i + ".\tEnter Student Number: ");
            student_number = input.nextLine();
            keys[i - 1] = student_number;
            System.out.print("\tEnter First Name: ");
            first_name = input.nextLine();
            students.put(student_number, first_name);
        }

        System.out.println("Student List: "); //step 5.2
        for (String key : keys) {
            System.out.println(key + ": " + students.get(key));
        }

        students.remove(keys[2]); //step 5.3
        System.out.print("Enter your student number: "); //step 5.4
        String my_number = input.nextLine();
        keys[2] = my_number;
        System.out.print("Enter your first name: ");
        String my_name = input.nextLine();
        students.put(my_number, my_name);

        System.out.println("Student List: "); //step 5.5
        for (String key : keys) {
            System.out.println(key + ": " + students.get(key));
        }
    }
}
