public class CountSubarrays {
    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for(int i= 0;i<n;i++){
            int sum = 0;
            for(int j = i;j<n;j++){
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count; // this is not a optimized solution (n^2).
        
    }
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,2,3}, 3)); // Output: 2
    }
}
