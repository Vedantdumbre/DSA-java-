import java.util.Arrays;

public class LongestConsecutiveSequence9 {
    public static int longestConsecutive(int[] nums) {
        int n= nums.length;
        if(n == 0) return 0;
        Arrays.sort(nums);
        int count = 1;
        int maxCount = 1;

        for(int i =0;i<n-1;i++){
            if (nums[i] == nums[i+1]) continue; // skip duplicates
            if(nums[i]+ 1 == nums[i+1] ){
                    count++;
                    maxCount = Math.max(maxCount, count);

                }   else{
                    count = 1; // reset count
                }
            }
        

        return maxCount;
    }
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2,2,3,4,5,6,7,8,9,1,0})); // Output: 4
        System.out.println(longestConsecutive(new int[]{0,0,1,1})); // Output: 2
        System.out.println(longestConsecutive(new int[]{1,2,3,4})); // Output: 4
        System.out.println(longestConsecutive(new int[]{1})); // Output: 1
        System.out.println(longestConsecutive(new int[]{0})); 
    }
}
