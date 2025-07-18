import java.util.Scanner;

public class UserInputExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Taking an integer input
        System.out.println("Enter an integer (e.g. 25): ");
        int intValue = sc.nextInt(); // reads whole number 

        // 2. Taking a double input
        System.out.println("Enter a decimal number (e.g. 3.14): ");
        double doubleValue = sc.nextDouble(); // reads numbers with decimals

        // 3. Taking a single word input
        System.out.println("Enter a single word (e.g. Billionaire): ");
        String word = sc.next(); // reads one word only up to the first space

        sc.nextLine(); // consume the leftover newline

        // 4. Taking a full line input
        System.out.println("Enter a full sentence (e.g. We are going places!): ");
        String sentence = sc.nextLine(); // read whole line, spaces included

        // 5. Taking a character input
        System.out.println("Enter a character (e.g. A): ");
        char character = sc.next().charAt(0); // gets first character from input

        // 6. Taking a boolean input
        System.out.println("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean(); // reads true or false only

        // --- Output everything that user entered ---
        System.out.println("--- User Summary ---");
        System.out.println("Integer: " + intValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("String word: " + word);
        System.out.println("String sentence: " + sentence);
        System.out.println("Char: " + character);
        System.out.println("Boolean: " + isStudent);

        sc.close();
    }
}


/*
Enter an integer (e.g. 25): 
25
Enter a decimal number (e.g. 3.14): 
3.14
Enter a single word (e.g. Billionaire): 
Billionare
Enter a full sentence (e.g. We are going places!): 
We going places !
Enter a character (e.g. A): 
A
Are you a student? (true/false): 
true
--- User Summary ---
Integer: 25
Double: 3.14
String word: Billionare
String sentence: We going places !
Char: A
Boolean: true
*/
