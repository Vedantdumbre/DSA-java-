public class MovesZerostoEnd7 {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0; // Count of non-zero elements

        // Move all non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }

        // Fill remaining positions with zeros
        while (count < n) {
            nums[count++] = 0;
        }

        // Print modified array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        moveZeroes(new int[] {0, 1, 0, 3,0,12,23,0,0, 12});
    }
}
