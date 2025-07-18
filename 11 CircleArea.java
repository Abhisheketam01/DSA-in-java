import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking radius from user as input
        System.out.println("Enter value of r: ");
        double radius = sc.nextDouble();


        // Calculating Area
        double  area = Math.PI * radius * radius;

        //print area of Circle

        System.out.println("Area of circle of" + radius + "is: "  + area);

        sc.close();


    }
}

/* 
Enter value of r: 
47
Area of circle of47.0is: 6939.778171779853
*/
