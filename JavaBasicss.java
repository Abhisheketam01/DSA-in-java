import java.util.Scanner;

public class JavaBasicss {
    // Function to calculate the sum of two numbers
    public static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting user to enter first number
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        // Prompting user to enter second number
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Calculating and displaying sum
        int sum = calculateSum(a, b);
        System.out.println("Sum is: " + sum);

        sc.close();
    }
}

