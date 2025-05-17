import java.util.Arrays;

public class TwoSumProblem1 {  //EASY 😎😎✨
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1; // Fixed this line

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{nums[left], nums[right]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1}; 
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(result)); 
    }
}
