package java_fundamentals;
public class Question21 {
    public static void main(String[] args) {
        // Initialize an integer array
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;
        double average;

        // Calculate the sum of array elements
        for (int num : numbers) {
            sum += num;
        }

        // Calculate the average
        average = (double) sum / numbers.length;

        // Print the results
        System.out.println("Sum of the array elements: " + sum);
        System.out.println("Average of the array elements: " + average);
    }
}
