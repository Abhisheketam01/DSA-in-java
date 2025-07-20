import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = sc.nextInt(), Original = num, rev = 0;
        
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        
        if (Original == rev)
          System.out.println("Palindrome");
          
        else 
          System.out.println("Not a palndrome");
    }
}

/* 
Enter a number: 
22
Palindrome
*/
