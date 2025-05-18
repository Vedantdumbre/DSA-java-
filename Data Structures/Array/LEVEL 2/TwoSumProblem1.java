import java.util.Arrays;
import java.util.HashMap;

public class TwoSumProblem1 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};  // return original indices
            }

            map.put(nums[i], i);  // value → index
        }

        return new int[]{-1, -1};  // No valid pair found
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{1, 6, 2, 10, 3}, 7);
        System.out.println(Arrays.toString(result)); // Example: [0, 1] (for 1 + 6 = 7)
    }
}
