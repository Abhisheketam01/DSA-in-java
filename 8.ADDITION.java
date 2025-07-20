import java.util.Scanner;

public class Addition{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Asking user for two number a and b
        System.out.println("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.println("Enter value of (b): ");
        int b = sc.nextInt();

        // adding a and b
        int sum = a + b;

        System.out.println("sum of a and b is : "+ sum);
    }
}
