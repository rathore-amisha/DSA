/*Question 1 : Print the sum, difference and product of two complex numbers by creating a
class named 'Complex' with separate methods for each operation whose real and imaginary
parts are entered by the user. */

public class practice_sheet1OOP {

    public static void main(String[] args) {
        complex c1 = new complex(5, 3);
        complex c2 = new complex(8, 4);

        complex sum = complex.add(c1, c2);
        complex diff = complex.subtract(c1, c2);
        complex prod = complex.multi(c1, c2);

        System.out.print("Sum: ");
        sum.printComplex();

        System.out.print("Difference: ");
        diff.printComplex();

        System.out.print("Product: ");
        prod.printComplex();
    }
}

class complex {
    int real;
    int img;

    public complex(int r, int i) {
        this.real = r;
        this.img = i;
    }

    public static complex add(complex a, complex b) {
        return new complex(a.real + b.real, a.img + b.img);
    }

    public static complex subtract(complex a, complex b) {
        return new complex(a.real - b.real, a.img - b.img);
    }

    // Correct formula for multiplication
    public static complex multi(complex a, complex b) {
        int realPart = (a.real * b.real) - (a.img * b.img);
        int imgPart = (a.real * b.img) + (a.img * b.real);
        return new complex(realPart, imgPart);
    }

    public void printComplex() {

        if (real == 0 && img != 0) {
            System.out.println(img + "i");
        } 
        else if (img == 0 && real != 0) {
            System.out.println(real);
        } 
        else {
            System.out.println(real + "+" + img + "i");
        }
    }
}