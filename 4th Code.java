import java.util.Scanner;

public class PrimitiveTypesDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. byte - very small integer (-128 to 127)
        System.out.print("Enter a byte value (e.g., 100): ");
        byte b = sc.nextByte();

        // 2. short - small integer (-32,768 to 32,767)
        System.out.print("Enter a short value (e.g., 30000): ");
        short s = sc.nextShort();

        // 3. int - regular integer
        System.out.print("Enter an int value (e.g., 100000): ");
        int i = sc.nextInt();

        // 4. long - large integer
        System.out.print("Enter a long value (e.g., 10000000000): ");
        long l = sc.nextLong();

        // 5. float - number with decimal point (single precision)
        System.out.print("Enter a float value (e.g., 3.14f): ");
        float f = sc.nextFloat();

        // 6. double - number with decimal point (double precision)
        System.out.print("Enter a double value (e.g., 3.14159): ");
        double d = sc.nextDouble();

        // 7. char - single character
        System.out.print("Enter a character (e.g., A): ");
        char c = sc.next().charAt(0); // reads first character from input

        // 8. boolean - true or false
        System.out.print("Enter true or false: ");
        boolean bool = sc.nextBoolean();

        // Output all values
        System.out.println("\n--- You entered ---");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        sc.close();
    }
}
