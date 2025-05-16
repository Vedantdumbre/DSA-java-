import java.util.HashMap;

public class LongestSubarray1314 {
    public static int longestSubarray(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(); // prefixSum → index
        int prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            if (prefixSum == k) {
                maxLen = i + 1;
            }

            if (map.containsKey(prefixSum - k)) {
                maxLen = Math.max(maxLen, i - map.get(prefixSum - k));
            }

            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        return maxLen;
    }
    public static void main(String[] args) {
        System.out.println(longestSubarray(new int[]{1, 2, 3, 4, 5,2,3,1,1,1}, 6));
    }

}
