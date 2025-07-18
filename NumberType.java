//2. Check if a Number is Positive, Negative, or Zero

import java.util.Scanner;

public class NumberType {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any integer you like : ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("num is Postive");
        } else if (num == 0) {
            System.out.println("num is zero");
        } else {
            System.out.println("num is Negative");
        }
        

        sc.close();
    }


/* 
Enter any integer you like : 
99
num is Postive
*/
