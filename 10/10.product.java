import java.util.Scanner;

public class product {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //Asking user for two numbers
        System.out.println("Enter a first number (a): ");
        double a = sc.nextDouble();

        System.out.println("Enter a second number (b): ");
        double b = sc.nextDouble();

        double product = a * b;

        System.out.println("product of a and b is: " + product);

        sc.close();

    }

}

// 

//
