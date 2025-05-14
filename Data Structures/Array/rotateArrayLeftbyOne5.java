public class rotateArrayLeftbyOne5 {
      public static int rotateLeftByOne(int[] nums) {
        int n = nums.length;
        int first = nums[0];
        
        for (int i = 0; i < n - 1; i++) {
            nums[i] = nums[i + 1];
        }
        
        nums[n - 1] = first;

        // Print rotated array
        for (int num : nums) {
            return num;
        }
        
    }

    public static void main(String[] args) {
        rotateLeftByOne(new int[]{1, 2, 3, 4, 5});
    }
}
