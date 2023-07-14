package assignment;
import java.util.Scanner;
public class SumOfNonPrimeElements {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] array = new int[size];
	        System.out.println("Enter the elements of the array:");

	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }

	        int sum = 0;
	        for (int num : array) {
	            if (!isPrime(num)) {
	                sum += num;
	            }
	        }

	        System.out.println("Sum of non-prime elements: " + sum);
	    }

	    // Function to check if a number is prime
	    public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }

	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
}