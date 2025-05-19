public class SortArrayof012  {
     public static void sortZeroOneTwo(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while(mid<=high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] =nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        for(int num : nums){
            System.out.print(num + " ");
        }

     }
     public static void main(String[] args) {
        sortZeroOneTwo(new int[]{0, 1, 2, 0, 1, 2,2,1,2,1,1,2,1,2,1,0,0,2,1,0,2,0});
     }
}
