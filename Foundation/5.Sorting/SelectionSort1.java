public class SelectionSort1 {  // easy
    public static void selectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }   
        System.out.println();
    }

    public static void main(String[] args) {
        selectionSort(new int[] {2, 3, 5, 1, 9,5,2,3});
    }
}
