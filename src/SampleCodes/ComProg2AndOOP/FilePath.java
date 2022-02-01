package SampleCodes.ComProg2AndOOP;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FilePath {
    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Javal Chapter8\\sample.txt");
        int count = filePath.getNameCount();
        System.out.println("Path is " + filePath.toString());
        System.out.println("File name is " + filePath.getFileName());
        System.out.println("There are " + count + " elements in the file path");
        for (int x = 0; x < count; ++x) {
            System.out.println("Element " + x + " is " + filePath.getName(x));
        }
    }
}

class AbsolutePath {
    public static void main(String[] args) {
        String fileName;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a filename: ");
        fileName = s.nextLine();
        Path inputPath = Paths.get(fileName);
        Path fullPath = inputPath.toAbsolutePath();
        System.out.println("The full path is " + fullPath.toString());
    }
}
