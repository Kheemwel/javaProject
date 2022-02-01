package ComProg2.Draft;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class TaskPerf6_v2 {
    public static final String delimiter = ",";
    //get the location of Documents folder in user's home directory
    //this code is use if the program will be run in other devices
    public static String location = System.getProperty("user.home") + File.separator + "Documents\\records.txt";
    public static final Path file = Paths.get(location);
    public static String username, password;

    static boolean containsNonAlphanumeric(String string) {
        return !string.matches("^[a-zA-Z0-9]*$");
    }

    static boolean notcontainsNonAlphanumeric(String string) {
        return !containsNonAlphanumeric(string);
    }

    static void start() {
        Scanner input = new Scanner(System.in);
        System.out.print("Press R for Register or L for Login: ");
        try {
            switch (input.nextLine().toUpperCase()) {
                case "R":
                    System.out.println();
                    register();
                    break;
                case "L":
                    System.out.println();
                    login();
                    break;
                default:
                    throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input.");
        }
    }

    static void register() {
        Scanner r = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Username: ");
                username = r.nextLine();
                if (notcontainsNonAlphanumeric(username)) {
                    System.out.print("Password: ");
                    password = r.nextLine();
                    if (notcontainsNonAlphanumeric(password)) {
                        try {
                            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
                            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));

                            String s = username + delimiter + password;
                            writer.write(s, 0, s.length());
                            writer.close();
                            break;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("Input should not contain non-alphanumeric characters (e.g.,@,%,#,!)");
            }
        }

        start();
    }

    static void login() {
        Scanner l = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Username: ");
                String username = l.nextLine();
                if (notcontainsNonAlphanumeric(username)) {
                    System.out.print("Password: ");
                    String password = l.nextLine();
                    if (notcontainsNonAlphanumeric(password)) {
                        try {
                            BufferedReader reader = new BufferedReader(new FileReader(file.toString()));
                            String data = reader.readLine();
                            String[] entry = data.split(delimiter);

                            if (username.equals(entry[0]) && password.equals(entry[1])) {
                                System.out.println("Successfully logged in");
                                break;
                            } else {
                                System.out.println("Incorrect username or password");
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("Input should not contain non-alphanumeric characters (e.g.,@,%,#,!)");
            }
        }
    }

    public static void main(String[] args) {
        start();
    }
}
