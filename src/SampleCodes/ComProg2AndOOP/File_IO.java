package SampleCodes.ComProg2AndOOP;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class File_IO {
    static class OutputStreamSample {
        public static void main(String[] args) {
            String s = "RANIKA";
            byte[] data = s.getBytes();
            OutputStream output;
            try {
                output = System.out;
                output.write(data);
                output.flush();
                output.close();
            } catch (Exception e) {
                System.out.println("Message: " + e);
            }
        }
    }

    static class BufferedOutputStreamSample {
        public static void main(String[] args) {
            Path file = Paths.get("C:\\Users\\Beller\\IdeaProjects\\javaProject\\src\\SampleCodes\\ComProg2AndOOP\\sample.txt");
            String s = "Kimwel Beller";
            byte[] data = s.getBytes();
            OutputStream output;
            try {
                output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
                output.write(data);
                output.flush();
                output.close();
            } catch (Exception e) {
                System.out.println("Message: " + e);
            }
        }
    }

    static class BufferedWriterSample {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Path file = Paths.get("C:\\Users\\Beller\\IdeaProjects\\javaProject\\src\\SampleCodes\\ComProg2AndOOP\\grades.txt");
            String s;
            String delimiter = ",";
            long id;
            String name;
            double grade;
            final long QUIT = 0;

            try {
                OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
                System.out.print("Enter student ID number: ");
                id = input.nextLong();
                while (id != QUIT) {
                    System.out.print("Enter name for student no. " + id + ": ");
                    input.nextLine();
                    name = input.nextLine();
                    System.out.print("Enter the subject grade: ");
                    grade = input.nextDouble();
                    DecimalFormat df = new DecimalFormat("0.00");
                    s = id + delimiter + name + delimiter + df.format(grade);
                    writer.write(s, 0, s.length());
                    writer.newLine();
                    System.out.print("Enter next ID number or " + QUIT + " to quit: ");
                    id = input.nextLong();
                }
                writer.close();
            } catch (Exception e) {
                System.out.println("Message: " + e);
            }
        }
    }
}






