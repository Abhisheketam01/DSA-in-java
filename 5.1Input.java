import java.util.Scanner;

public class UserInputExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Taking an integer input
        System.out.print("Enter an integer (e.g., 25): ");
        int intValue = sc.nextInt();  // reads whole numbers like 10, 25, etc.

        // 2. Taking a double input
        System.out.print("Enter a decimal number (e.g., 3.14): ");
        double doubleValue = sc.nextDouble();  // reads numbers with decimals

        // 3. Taking a single word input
        System.out.print("Enter a single word (e.g., Hello): ");
        String word = sc.next();  // reads one word only, up to first space

        // 4. Taking a full line input
        sc.nextLine(); // consume leftover newline
        System.out.print("Enter a full sentence (e.g., Java is fun!): ");
        String sentence = sc.nextLine();  // reads whole line (spaces included)

        // 5. Taking a character input
        System.out.print("Enter a single character (e.g., A): ");
        char character = sc.next().charAt(0);  // gets first character from word

        // 6. Taking a boolean input
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();  // reads true or false only

        // --- Output everything the user entered ---
        System.out.println("\n--- User Input Summary ---");
        System.out.println("Integer: " + intValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Word: " + word);
        System.out.println("Sentence: " + sentence);
        System.out.println("Character: " + character);
        System.out.println("Boolean: " + isStudent);

        sc.close();  // Always close the scanner
    }
}
