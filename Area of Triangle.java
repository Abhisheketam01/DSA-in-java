import java.util.Scanner;

public class TriangleArea{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // To calculate area of triangle we have to take BASE & HEIGHT as input

        //input BASE
        System.out.println("Enter value of BASE: ");
        Double BASE = sc.nextDouble();
        
        //input HEIGHT
        System.out.println("Enter value of HEIGHT: ");
        Double HEIGHT = sc.nextDouble();

        // area of triangle
        Double area = 0.5 * BASE * HEIGHT;

        System.out.println("The area of triangle is : " + area);

        sc.close();

    }
}

/* Enter value of BASE: 
2
Enter value of HEIGHT: 
10
The area of triangle is : 10.0 */
