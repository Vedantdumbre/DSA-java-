public class findConsecutiveOnes11 {
    public static  int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;

        int n = nums.length;
        for(int i=0;i<=n-1;i++){
            if(nums[i]==1){
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            }
            else{
                count = 0;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1,1,1,1}));
    }
}
