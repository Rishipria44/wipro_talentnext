package java_fundamentals;

public class Question24 {
	    public static void main(String[] args) {
	        // Initialize an integer array with ASCII values
	        int[] asciiValues = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100};

	        System.out.print("Characters: ");

	        // Loop through the array and print corresponding characters
	        for (int value : asciiValues) {
	            System.out.print((char) value);
	        }

	        // Move to the next line after printing all characters
	        System.out.println();
	    }
	}
