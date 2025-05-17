public class rotateArraybyKPlaces6 {
    public static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // If k > n

        while (k-- > 0) {
            int first = nums[0];
            for (int i = 0; i < n - 1; i++) {
                nums[i] = nums[i + 1];
            }
            nums[n - 1] = first;
        }

        // Print rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        rotateArray(new int[] {1, 2, 3, 4, 5, 6}, 2);
    }
}
