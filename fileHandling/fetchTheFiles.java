import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner;

public class FetchTheFiles {
    public static void main(String[] args) {
        File myObj2 = new File("./fileHandling/java.txt"); // file exists
        
        if (myObj2.exists()) {
            System.out.println("File exists.");
            System.out.println("Readable: " + myObj2.canRead()); // this method return true if file is readable
            
            // Reading the content of the file
            try (Scanner fileReader = new Scanner(myObj2)) {
                System.out.println("File contents:");
                while (fileReader.hasNextLine()) {
                    String data = fileReader.nextLine();
                    System.out.println(data);
                }
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred while trying to read the file.");
                e.printStackTrace();
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}


