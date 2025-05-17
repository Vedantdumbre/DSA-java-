public class NumberthatAppearsOnce12 {
    public static int singleNumber(int[] nums) {
       
        int n = nums.length;
        int XOR = 0;
        for(int i =0;i<n;i++){
            XOR ^= nums[i];
        }

        return XOR;
    }
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,4,1,2}));
    }
}
