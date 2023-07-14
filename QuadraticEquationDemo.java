package assignment;

import java.util.Scanner;

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return 0;
        } else {
            return (-b + Math.sqrt(discriminant)) / (2 * a);
        }
    }

    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return 0;
        } else {
            return (-b - Math.sqrt(discriminant)) / (2 * a);
        }
    }
}

public class QuadraticEquationDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double discriminant = equation.getDiscriminant();

        if (discriminant > 0) {
            double root1 = equation.getRoot1();
            double root2 = equation.getRoot2();
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            double root = equation.getRoot1();
            System.out.println("Root: " + root);
        } else {
            System.out.println("The equation has no roots.");
        }
    }
}
