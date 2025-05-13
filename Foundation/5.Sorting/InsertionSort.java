public class InsertionSort {

    static void insertionsort(int[] nums) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;

            // Shift elements to right until correct position is found
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            // Place the key at its correct position
            nums[j + 1] = key;
        }

        // Print sorted array
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        insertionsort(new int[]{2, 3, 5, 1, 9, 5, 2, 3});
    }
}
