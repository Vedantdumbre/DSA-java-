    public class RemoveDuplicate4 {
        public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

        public static void main(String[] args) {
            System.out.println(removeDuplicates(new int[]{1,2,3,4,5,6,7,8}));
            System.out.println(removeDuplicates(new int[]{11,11,22,33,44,55}));
            System.out.println(removeDuplicates(new int[]{1,1,1,1,1,1}));
        }
    }
