/* 
8) Implement exception handling in a Java program that reads data from a file.
 If the file does not exist, throw a "FileNotFoundException" 
 and display an error message to the user.
 */

 import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 class FileException {
    public static void main(String[] args) {
        String fileName = "D:\\github\\Tasks\\Day13\\Text.txt";

        try {
            File file = new File(fileName);
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());

        }
    }
}
