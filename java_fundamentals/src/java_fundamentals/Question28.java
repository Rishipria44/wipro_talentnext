package java_fundamentals;
public class Question28 {
    public static void main(String[] args) {
        int[] numbers1 = {10, 3, 6, 1, 2, 7, 9};
        int[] numbers2 = {7, 1, 2, 3, 6};
        int[] numbers3 = {1, 6, 4, 7, 9};

        System.out.println("Output for Array 1: " + calculateSum(numbers1));
        System.out.println("Output for Array 2: " + calculateSum(numbers2));
        System.out.println("Output for Array 3: " + calculateSum(numbers3));
    }

    static int calculateSum(int[] arr) {
        int sum = 0;
        boolean skip = false;

        for (int num : arr) {
            if (num == 6) {
                skip = true; // Start skipping
            }
            if (!skip) {
                sum += num; // Add to sum if not skipping
            }
            if (num == 7 && skip) {
                skip = false; // Stop skipping after 7
            }
        }
        return sum;
    }
}
