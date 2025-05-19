import java.util.ArrayList;
import java.util.Collections;

public class LeadersinArray7 {
    public static ArrayList<Integer> leaders(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        if (nums.length == 0) {
            return ans;
        }
        
        // Last element of the array is always a leader
        int max = nums[nums.length - 1];
        ans.add(nums[nums.length - 1]);
        
        // Check elements from right to left
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > max) {
                ans.add(nums[i]);
                max = nums[i];
            }
        }
        
        /* Reverse the list to match
        the required output order */
        Collections.reverse(ans);
        
        // Return the leaders
        return ans;
        }
    
    public static void main(String[] args) {
        System.out.println(leaders(new int[]{16})); 
    }
}
