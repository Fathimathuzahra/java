import java.util.Scanner;

class AreaCalculator {
    double area(double r) {
        return Math.PI * r * r;
    }

    double area(double l, double b) {
        return l * b;
    }

    double area(double b, double h, boolean t) {
        return 0.5 * b * h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator calc = new AreaCalculator();

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Circle: " + calc.area(r));

        System.out.print("Enter length and breadth of rectangle: ");
        double l = sc.nextDouble(), b = sc.nextDouble();
        System.out.println("Rectangle: " + calc.area(l, b));

        System.out.print("Enter base and height of triangle: ");
        double base = sc.nextDouble(), h = sc.nextDouble();
        System.out.println("Triangle: " + calc.area(base, h, true));
    }
}
