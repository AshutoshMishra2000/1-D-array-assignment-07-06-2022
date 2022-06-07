
import java.util.ArrayList;

public class maxSum_SubArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 5, 4, 5, 6, 7 };
        int k = 3;

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
        }

        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];
            if (sum > max) {
                max = sum;
            }

        }

        System.out.println("Maximum sum of subarry: " + max);
    }
}
