public class LinearSearch8 {
    public static int linearSearch(int nums[], int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                return i;
            }          
        }

        return -1;
    }
    public static void main(String[] args) {
        System.out.println(linearSearch(new int[] {1,2,3,3,5,6}, 1));
    }
}

