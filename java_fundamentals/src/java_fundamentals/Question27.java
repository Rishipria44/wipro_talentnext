package java_fundamentals;
import java.util.LinkedHashSet;
import java.util.Set;

public class Question27 {
    public static void main(String[] args) {
        // Initialize an array with duplicate elements
        int[] numbers = {10, 20, 10, 30, 40, 20, 50, 30};

        System.out.println("Original array with duplicates:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Use LinkedHashSet to remove duplicates and preserve order
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        for (int num : numbers) {
            uniqueNumbers.add(num);
        }

        // Convert Set back to array (if needed)
        Integer[] result = uniqueNumbers.toArray(new Integer[0]);

        System.out.println("\n\nArray after removing duplicates:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
