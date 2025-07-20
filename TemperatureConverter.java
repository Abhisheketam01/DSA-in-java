// Convert Temperature (Celsius ↔ Fahrenheit)
 
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       //Calculate Farenheit , input Celcius
       System.out.println("Enter temperature in Celcius to calculate Farenheit: ");
       Double C = sc.nextDouble();
       Double Farenheit = ( C * 9/5) + 32;

       // Calculate Celcius , input Farenheit
       System.out.println("Enter temperature in Farenheit to calculate celcius: ");
       Double F = sc.nextDouble();
       Double Celcius = ( F - 32) * 5/9;

       //RESULT
       System.out.println("The value of Farenheit is: " + Farenheit);
       System.out.println("The value of Celcius is : " + Celcius);

       sc.close();
    }
    

}

/* 
Enter temperature in Celcius to calculate Farenheit: 
100
Enter temperature in Farenheit to calculate celcius: 
273
The value of Farenheit is: 212.0
The value of Celcius is : 133.88888888888889
*/
