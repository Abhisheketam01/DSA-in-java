import java.util.Scanner;

public class SquareArea{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        // take side of square as input

        System.out.println("Enter the value of side: ");
        double side = sc.nextDouble();

        //calculating area of square here
        Double area = side * side ;

        // printing the value of area

        System.out.println("Area of Square is :" + area);

        sc.close();


    }

}

/* 
Enter the value of side: 
7
Area of Square is :49.0
*/
