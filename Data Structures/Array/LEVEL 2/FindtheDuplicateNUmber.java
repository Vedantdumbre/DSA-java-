

public class FindtheDuplicateNUmber {
    public static int findDuplicate(int[] nums) {
       boolean[] vis = new boolean[nums.length];
        for(int num : nums){
            if(vis[num]){
                return num;
            }
            vis[num] = true;
        }

        return -1;
    }
    public static void main(String[] args) {
       System.out.println(findDuplicate(new int[]{3,1,3,4,2})); 
    }

}
