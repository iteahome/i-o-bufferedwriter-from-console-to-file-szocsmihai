import java.io.*;
import java.util.Scanner;

public class ConsoleToFile {

//  Dedicated method for writing content to the end of a file:
    public static void writeToFile(String userInput) {
        String destinationFile = "./src/main/resources/console2file.txt";
        try {
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(destinationFile, true));
            fileWriter.write(userInput + " ");
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//  Main method containing UI:
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String userInput = keyboardScanner.nextLine();
        while (!userInput.equals("exit")) {
            ConsoleToFile.writeToFile(userInput);
            System.out.println("Enter text:");
            userInput = keyboardScanner.nextLine();
        }
    }
}
