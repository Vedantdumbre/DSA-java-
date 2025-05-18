import java.util.Arrays;

public class MajorityElement2 {
    public static int majorityElement(int[] nums) {

        if (nums.length == 1) {
            return nums[0]; 
            
        }
        Arrays.sort(nums);
        int n=nums.length;
        int count=1;
        int maxCount=1;
        int majorityElement=nums[0];

        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]) {
                count++;
            }
            else {
                count=1;
            }

            if(count>maxCount) {
                maxCount=count;
                majorityElement=nums[i];
            }
            if (maxCount>n/2) {
                return majorityElement;
                
            }
        }
        
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,2}));
    }
}
