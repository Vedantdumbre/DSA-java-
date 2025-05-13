public class InsertionSort {

    static void insertionsort(int[] nums) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;

        
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];  // yahipe sorting hoti hai 
                j--;
            }

            nums[j + 1] = key;
        }
        //pritning sorted array 
        for (int num : nums) { // for-each loop used 
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        insertionsort(new int[]{2, 12,324,23,32,3,43,39, 5, 2, 3});
    }
}
