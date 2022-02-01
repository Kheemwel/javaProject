package ComProg2.Draft;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class TaskPerf6 {
    public static final String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}\\";
    public static final String recordsPath = "C:\\Users\\Beller\\IdeaProjects\\javaProject\\src\\ComProg2\\Draft\\records.txt";
    public static final String delimiter = ",";

    public static void main(String[] args) {
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
                String username = r.nextLine();
                if (!containsSpecialCharacter(username)) {
                    System.out.print("Password: ");
                    String password = r.nextLine();
                    if (!containsSpecialCharacter(password)) {
                        try {
                            Path file = Paths.get(recordsPath);
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
                        throw new SpecialCharacterException();
                    }
                } else {
                    throw new SpecialCharacterException();
                }
            } catch (SpecialCharacterException s) {
                System.out.println(s.getMessage());
            }
        }
    }

    static void login() {
        Scanner l = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Username: ");
                String username = l.nextLine();
                if (!containsSpecialCharacter(username)) {
                    System.out.print("Password: ");
                    String password = l.nextLine();
                    if (!containsSpecialCharacter(password)) {
                        try {
                            BufferedReader reader = new BufferedReader(new FileReader(recordsPath));
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
                        throw new SpecialCharacterException();
                    }
                } else {
                    throw new SpecialCharacterException();
                }
            } catch (SpecialCharacterException s) {
                System.out.println(s.getMessage());
            }
        }
    }

    static boolean containsSpecialCharacter(String string) {
        boolean result = false;
        for (char c : specialCharactersString.toCharArray()) {
            for (char s : string.toCharArray()) {
                if (s == c) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public static class SpecialCharacterException extends Exception {
        public SpecialCharacterException() {
            super("Input should not contain non-alphanumeric characters (e.g.,@,%,#,!)");
        }
    }
}
