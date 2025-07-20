import java.util.Scanner;

public class calculator{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // e.g if inputs a = 12 and b = 4
        // a = 12 , b = 4
        // sum = 12 + 4 = 16
        // diff = 12 - 4 = 8
        // prod = 12*4 = 48
        // div = 12/4 = 3

        System.out.println("Enter fist number:" );
        double a = sc.nextDouble();

        System.out.println("Enter second number:" );
        double b = sc.nextDouble();

        double sum = a+b;
        double diff = a-b;
        double prod = a*b;
        double div = a/b;

        System.out.println("addition: " + sum);
        System.out.println("difference: " + diff);
        System.out.println("product: " + prod);
        System.out.println("division: " + div);

        sc.close();



    }
}
