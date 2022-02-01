package SampleCodes.ComProg2AndOOP;

import java.io.IOException;
import java.nio.file.*;

import static java.nio.file.AccessMode.EXECUTE;
import static java.nio.file.AccessMode.READ;

public class File_CheckAccess {
    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Users\\Beller\\IdeaProjects\\javaProject\\src\\SampleCodes\\ComProg2AndOOP\\sample.txt");
        System.out.println("Path is " + filePath.toString());
        try {
            filePath.getFileSystem().provider().checkAccess(filePath, READ, EXECUTE);
            System.out.println("The file can be read and executed.");
        } catch (IOException e) {
            System.out.println("The file cannot be used.");
        }
    }
}

class DeletePath {
    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Javal\\Chapter8\\lexample.txt");
        try {
            Files.delete(filePath);
            //Files.deleteIfExists(filePath);
            System.out.println("The file or directory is deleted");
        } catch (NoSuchFileException e) {
            System.out.println("No such file or directory");
        } catch (DirectoryNotEmptyException e) {
            System.out.println("Directory is not empty");
        } catch (SecurityException e) {
            System.out.println("No permission to delete");
        } catch (IOException e) {
            System.out.println("IO exception");
        }
    }
}










