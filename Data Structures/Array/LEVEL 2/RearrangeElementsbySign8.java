import java.util.Arrays;

public class RearrangeElementsbySign8 {
    /*public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int posIndex = 0, negIndex = 1;

        for(int i =0;i<n;i++){
            if(nums[i]<0){
                ans[negIndex] =nums[i];
                negIndex+=2;
            }else{
                ans[posIndex] = nums[i];
                posIndex+=2;
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrangeArray(new int[]{1,2,3,-4,-5,-6}))); 
    } */

// this is a question to find the type of triangle.
    public static String triangleType(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n != 3)  return "none";
        int a = nums[0], b = nums[1], c = nums[2];
        
        if (a + b <= c) {
            return "none";
        }

        if (a == b && b == c) {
            return "equilateral";
        } else if (a == b || b == c || a == c) {
            return "isosceles";
        } else {
            return "scalene";
        }

    }
    public static void main(String[] args) {
        System.out.println(triangleType(new int[]{2,5,4})); 
    }

}
