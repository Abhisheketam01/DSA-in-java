//9. Perimeters of Square, Circle, Rectangle
//perimter of square is = 4s , side 
//perimter of circle is = 2PIr radius
// perimter of rectangle = 2(l + w) , length and width

import java.util.Scanner;

public class Perimeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //SQUARE
        System.out.println("Enter value of side of square to calculate perimter of square: ");
        double side = sc.nextDouble();
        Double perimeterOfSquare = 4 * side ; 

        //CIRCLE
        System.out.println("Enter the value of radius to calculate perimter of circle: ");
        Double radius = sc.nextDouble();
        Double PerimterOfCircle = 2 * Math.PI * radius ;
        
        //RECTANGLE
        System.out.println("Enter value of length to calculate perimeter of rectangle: ");
        Double length = sc.nextDouble();
        
        System.out.println("Enter value of Width to calculate perimeter of rectangle: ");
        Double width = sc.nextDouble();

        Double PerimeterOfRectangle = 2 * (length + width);

        //RESULT

        System.out.println("Perimeter Of Square is : " + perimeterOfSquare);
        System.out.println("Perimeter Of Circle is: " + PerimterOfCircle);
        System.out.println("Perimeter Of Rectangle is: " + PerimeterOfRectangle);

        sc.close();


 

    }
}

/* 
Enter value of side of square to calculate perimter of square: 
12
Enter the value of radius to calculate perimter of circle: 
12
Enter value of length to calculate perimeter of rectangle: 
12
Enter value of Width to calculate perimeter of rectangle: 
12
Perimeter Of Square is : 48.0
Perimeter Of Circle is: 75.39822368615503
Perimeter Of Rectangle is: 48.0*/
