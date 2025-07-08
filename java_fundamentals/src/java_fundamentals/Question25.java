package java_fundamentals;
import java.util.Arrays;

	public class Question25 {
	    public static void main(String[] args) {
	        // Initialize an integer array
	        int[] numbers = {25, 11, 7, 89, 56, 43, 2, 99};

	        // Sort the array in ascending order
	        Arrays.sort(numbers);

	        // Smallest two numbers
	        int smallest1 = numbers[0];
	        int smallest2 = numbers[1];

	        // Largest two numbers
	        int largest1 = numbers[numbers.length - 1];
	        int largest2 = numbers[numbers.length - 2];

	        // Print results
	        System.out.println("Smallest two numbers: " + smallest1 + ", " + smallest2);
	        System.out.println("Largest two numbers: " + largest1 + ", " + largest2);
	    }
	}
