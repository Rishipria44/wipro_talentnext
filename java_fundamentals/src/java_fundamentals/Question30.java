package java_fundamentals;
import java.util.Arrays;

public class Question30 {
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 1, 0, 0, 1, 1};
        int[] arr2 = {3, 3, 2};
        int[] arr3 = {2, 2};

        System.out.println("evenOdd: " + Arrays.toString(evenOdd(arr1)));
        System.out.println("evenOdd: " + Arrays.toString(evenOdd(arr2)));
        System.out.println("evenOdd: " + Arrays.toString(evenOdd(arr3)));
    }

    public static int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int start = 0, end = nums.length - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                result[start++] = num;
            } else {
                result[end--] = num;
            }
        }
        return result;
    }
}
