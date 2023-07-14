package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExHandle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the number of elements in the array: ");
            int size = scanner.nextInt();

            int[] array = new int[size];
            System.out.println("Enter the elements of the array:");

            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            int minimum = findMinimum(array);
            int maximum = findMaximum(array);

            System.out.println("Minimum value: " + minimum);
            System.out.println("Maximum value: " + maximum);
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: Invalid array size. Please enter a positive integer.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter integers only.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds. Please check the array size and input values.");
        }
    }

    public static int findMinimum(int[] array) {
        int minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    public static int findMaximum(int[] array) {
        int maximum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
        return maximum;
    }
}
