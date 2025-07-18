import java.util.Scanner;

public class RectangleArea{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //To calculate area of rectangle we have to take length and Breadth as input

        System.out.println("Enter value of length: ");
        Double length = sc.nextDouble();

        System.out.println("Enter value of breadth: ");
        Double breadth = sc.nextDouble();

        // area of rectangle...

        Double area = length * breadth ;
        System.out.println("Area of Rectangle is : " + area);

        sc.close();



    }
}

/*
Enter value of length: 
10
Enter value of breadth: 
20
Area of Rectangle is : 200.0
*/
