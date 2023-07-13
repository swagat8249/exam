package assignment;

import java.util.Scanner;

public class A5q3 {
    public static void main(String[] args) {
        int[] array = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the number to be searched: ");
        int searchNumber = sc.nextInt();

        int count = 0;

        for (int i = 0; i < 10; i++) {
            if (array[i] == searchNumber) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("The number " + searchNumber + " is present in the array.");
            System.out.println("It appears " + count + " time(s) in the array.");
        } else {
            System.out.println("The number " + searchNumber + " is not present in the array.");
        }

    }
}
