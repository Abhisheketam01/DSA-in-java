import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Enter any integer you like

        System.out.println("Enter any integer you like: ");
        int IntValue = sc.nextInt();

        // condition sttement
         if(IntValue % 2 == 0) {
            System.out.println(IntValue + " is even");
         } else {
            System.out.println(IntValue + " is odd");
        }
        
        sc.close();
        
    }
}


/* 
Enter any integer you like: 
22
22 is even
*/
