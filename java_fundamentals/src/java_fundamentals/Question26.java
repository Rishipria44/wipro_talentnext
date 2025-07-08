package java_fundamentals;


	import java.util.Arrays;

	public class Question26{
	    public static void main(String[] args) {
	        // Initialize an integer array
	        int[] numbers = {45, 12, 89, 33, 7, 56, 21};

	        System.out.println("Original array:");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }

	        // Sort the array in ascending order
	        Arrays.sort(numbers);

	        System.out.println("\n\nSorted array in ascending order:");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	    }
	}
