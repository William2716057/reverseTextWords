import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        // Create a File object
        File file = new File("sample.txt");

        try {
            //Scanner object to read from the file
            Scanner fileScanner = new Scanner(file);

            //Initialize an empty string
            StringBuilder inputBuilder = new StringBuilder();

            //Read each line of the file
            while (fileScanner.hasNextLine()) {
                //Append each line
                inputBuilder.append(fileScanner.nextLine());
                inputBuilder.append("\n"); //Append a newline character to separate lines
            }

            //Close file scanner
            fileScanner.close();

            //Extract text from the StringBuilder
            String input = inputBuilder.toString();

            //Split text into words
            String[] words = input.split("\\s+");

            //Create StringBuilder to store reversed text
            StringBuilder reversedText = new StringBuilder();

            //Process each word
            for (String word : words) {
                //Reverse current word
                String reversedWord = new StringBuilder(word).reverse().toString();
                //Append reversed word and a space to the reversed text
                reversedText.append(reversedWord).append(" ");
            }

            //Convert StringBuilder to a string and trim trailing spaces
            String result = reversedText.toString().trim();

            // Print result
            System.out.println("Result: " + result);
        } catch (FileNotFoundException e) {
            // Handle file not found exception
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
