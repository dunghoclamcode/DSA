import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample {

        public static void main(String[] args) {
            // 1. Checked Exception
            try {
                FileReader file = new FileReader("nonexistentfile.txt"); // Causes IOException
                BufferedReader reader = new BufferedReader(file);
                System.out.println(reader.readLine());
            } catch (IOException e) {
                System.out.println("Checked Exception caught: " + e.getMessage());
            }

            // 2. Unchecked Exception
            try {
                String text = null;
                System.out.println(text.length()); // Causes NullPointerException
            } catch (NullPointerException e) {
                System.out.println("Unchecked Exception caught: " + e.getMessage());
            }

            // 3. Error
            try {
                recursiveMethod(); // Causes StackOverflowError
            } catch (StackOverflowError e) {
                System.out.println("Error caught: " + e);
            }
        }

        public static void recursiveMethod() {
            recursiveMethod(); // Infinite recursion
        }

}




