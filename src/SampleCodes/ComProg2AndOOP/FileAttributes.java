package SampleCodes.ComProg2AndOOP;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class FileAttributes {
    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Users\\Beller\\IdeaProjects\\javaProject\\src\\SampleCodes\\ComProg2AndOOP\\sample.txt");
        try {
            BasicFileAttributes fileAtt = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Size: " + fileAtt.size() + " bytes");
            System.out.println("Creation time: " + fileAtt.creationTime());
            System.out.println("Last modified time: " + fileAtt.lastModifiedTime());
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}

class CompareFile {
    public static void main(String[] args) {
        Path file1 = Paths.get("C:\\Users\\Beller\\IdeaProjects\\javaProject\\src\\SampleCodes\\ComProg2AndOOP\\example.txt");
        Path file2 = Paths.get("C:\\Users\\Beller\\IdeaProjects\\javaProject\\src\\SampleCodes\\ComProg2AndOOP\\sample.txt");
        try {
            BasicFileAttributes fileAtt1 = Files.readAttributes(file1, BasicFileAttributes.class);
            BasicFileAttributes fileAtt2 = Files.readAttributes(file2, BasicFileAttributes.class);
            FileTime time1 = fileAtt1.creationTime();
            FileTime time2 = fileAtt2.creationTime();
            System.out.println("file1's creation time is : " + time1);
            System.out.println("file2's creation time is: " + time2);
            if (time1.compareTo(time2) < 0) {
                System.out.println("file1 was created before file2.");
            } else if (time1.compareTo(time2) > 0) {
                System.out.println("file1 was created after file2.");
            } else {
                System.out.println("file1 and file2 were created at the same time.");
            }
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}




