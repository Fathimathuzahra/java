Q)Add complex numbers

code:

import java.util.Scanner;
class Complexadd {
    int real, imag;

    Complexadd() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter real and imaginary part:");
        real = s.nextInt();
        imag = s.nextInt();
    }

    public static void main(String[] args) {
        Complexadd c1 = new Complexadd();
        Complexadd c2 = new Complexadd();
        System.out.println("Sum: " + (c1.real + c2.real) + " + i" + (c1.imag + c2.imag));
    }
}

output:

Enter real and imaginary part:
20 1
Enter real and imaginary part:
3 12
Sum: 23 + i13


