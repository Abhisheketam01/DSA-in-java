import java.util.Scanner; //part 1 is done

// part 2 is done
public class PrimitiveTypes{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //1. byte - very small interger size (-128 to 127)
    System.out.println("Enter a byte value (e.g 100): ");
    byte b = sc.nextByte();

    //2. Short - small integer (e.g -32,768 to 32,767)
    System.out.println("Enter a short value e.g 30000 :");
    short s = sc.nextShort();

    //3. int - regular integer
    System.out.println("Enter a integer e.g 100000: ");
    int i = sc.nextInt();

    //4. long - longer int
    System.out.println("Enter a longer int e.g 10000000");
    long l = sc.nextLong();

    //5. float - number with decimal point (single precision);
    System.out.println("Enter a float value e.g 3.14f: ");
    float f = sc.nextFloat();

    //6. double - number with (double preision)
    System.out.println("Enter a double value: ");
    double d = sc.nextDouble();

    //7. char - single character (e.g A)
    System.out.println("Enter a character e.g A: ");
    char c = sc.next().charAt(0);

    // 8. boolean - true or false
    System.out.println("Enter a true or a false");
    boolean bool = sc.nextBoolean();

    // PART 3
    // LETS PRINT IT ALL
    System.out.println("\n--- You entered ---");
    System.out.println("byte:" + b);
    System.out.println("short:" + s);
    System.out.println("int" + i);
    System.out.println("long" + l);
    System.out.println("float" + f);
    System.out.println("double"+ d);
    System.out.println("char" + c);
    System.out.println("boolean" + bool);

    // part 4
     sc.close();

  }
}
