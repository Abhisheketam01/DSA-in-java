class ComplexNumber {
    int real, imag;

    ComplexNumber(int r, int i) {
        real = r;
        imag = i;
    }

    ComplexNumber add(ComplexNumber c) {
        return new ComplexNumber(real + c.real, imag + c.imag);
    }

    void displayinfo() {
        System.out.println(real + "+" + imag + "i");
    }
}

// Changed public class name to match file name: ComplexNumber.java
public class ComplexNumberTest {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(3, 4);
        ComplexNumber num2 = new ComplexNumber(1, 2);
        ComplexNumber result = num1.add(num2);
        result.displayinfo();  // Output: 4+6i
    }
}


/* 
// Output: 4+6i
*/
