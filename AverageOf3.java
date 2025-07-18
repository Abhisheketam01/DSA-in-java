import java.util.Scanner;

public class AverageOf3{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    // taking 3 input values lets x , y and z

    //x
    System.out.println("Enter value of x: ");
    double x = sc.nextDouble();

    //y
    System.out.println("Enter value of y: ");
    double y = sc.nextDouble();

    //z
    System.out.println("Enter value of z: ");
    double z = sc.nextDouble();

    // average of x , y and z

    double average = (x + y + z ) / 3;

    System.out.println("Average of x , y and z is: " + average);

    sc.close();



    }
}

/* 
Enter value of x: 
1
Enter value of y: 
2
Enter value of z: 
3
Average of x , y and z is: 2.0
*/
