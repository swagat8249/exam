package assignment;

public class A5q4 {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 2, 8, 10, 3, 8, 1, 10}; // Replace with your array

        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        int minOccurrences = 0;
        int maxOccurrences = 0;
        int minLastPosition = -1;
        int maxFirstPosition = -1;

        for (int i = 0; i < array.length; i++) {
            int current = array[i];

            if (current < minimum) {
                minimum = current;
                minOccurrences = 1;
                minLastPosition = i;
            } else if (current == minimum) {
                minOccurrences++;
                minLastPosition = i;
            }

            if (current > maximum) {
                maximum = current;
                maxOccurrences = 1;
                maxFirstPosition = i;
            } else if (current == maximum) {
                maxOccurrences++;
            }
        }

        System.out.println("Minimum value: " + minimum);
        System.out.println("Maximum value: " + maximum);
        System.out.println("Occurrences of minimum: " + minOccurrences);
        System.out.println("Occurrences of maximum: " + maxOccurrences);
        System.out.println("Position of the first occurrence of maximum: " + maxFirstPosition);
        System.out.println("Position of the last occurrence of minimum: " + minLastPosition);
    }
}

