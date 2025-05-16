public class FindMissingNumberinArray10 {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum= n*(n+1)/2;
        int sum2 =0;
        for(int i =0;i<=n-1;i++){
            sum2+=nums[i];
        }
        return sum-sum2;

    }
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3,0,1,2,4,5,6}));
    }
}
