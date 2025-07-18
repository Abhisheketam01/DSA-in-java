import java.util.Scanner;

public class SwapNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Enter value of a and b , swap them

        System.out.println("Enter value of (a): ");
        int a = sc.nextInt();

        System.out.println("Enter value of (b): ");
        int b = sc.nextInt();

        int swap = a;
        a = b;
        b = swap;

        System.out.println("After swapping the value of a is :" + a + " and b is :" + b);

        sc.close();

    }
}

/*
Enter value of (a): 
3
Enter value of (b): 
4
After swapping the value of a is :4 and b is :3
*/
