public class MaximumSubArray3 {
    public static int maxSubArray(int[] nums) {
        int maxvalue = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            maxvalue = Math.max(maxvalue, sum);
        }

        return maxvalue;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, -2, -3, -4})); 
    }
}
