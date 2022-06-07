
import java.util.ArrayList;

public class subArrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] = { 6, 6, 6, 6, 7, 4, 5, 6,6,6, 6 };
       
        int givenSum = 18;
        int k = 3;

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
            if (sum == givenSum) {
                System.out.println("from "+(k-(i+1))+" to "+i);
            }

        }

        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];
            if (sum == givenSum) {
                System.out.println("from "+(i-k+1)+" to "+i);
            }

        }

        
    }
}
