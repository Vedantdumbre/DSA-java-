import java.util.*;

public class MostFrequentElement {
    public static void main(String[] args) {
        int arr[] = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        Frequency(arr, n);
    }

    static void Frequency(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int maxFreq = 0;
        int minVal = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int val = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFreq || (freq == maxFreq && val < minVal)) {
                maxFreq = freq;
                minVal = val;
            }
        }

        System.out.println("Most frequent (smallest in tie): " + minVal);
    }
}
