import java.util.HashMap;

public class frequencyOfElementInGivenKthSubArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,5,1,1,1 };
        int k = 3;
        int value = 1;
        int count = 0;
        int key = 1;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < k; i++) {
            if (arr[i] == value) {
                count++;
            }
        }
        hm.put(key++, count);
        count = 0;
        for (int i = k; i < arr.length; i++) {
            for (int j = i - k + 1; j <= i; j++) {
                if (arr[j] == value) {
                    count++;
                }
            }

            hm.put(key++, count);
            count=0;
        }

        System.out.println(hm);
    }
}
