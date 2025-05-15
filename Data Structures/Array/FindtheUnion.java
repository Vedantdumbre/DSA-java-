    import java.util.Arrays;
    import java.util.HashSet;
    import java.util.Set;

    public class FindtheUnion {
        public static int[] unionArray(int[] nums1, int[] nums2) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums1) set.add(num);
            for (int num : nums2) set.add(num);

            // Convert Set to array
            int[] result = new int[set.size()];
            int i = 0;
            for (int num : set) {
                result[i++] = num;
            }
            Arrays.sort(result); // Sort the result array
            return result;
        }

        public static void main(String[] args) {
            int[] res = unionArray(new int[]{1, 2, 3}, new int[]{1,2,3,3, 4, 5,33});
            System.out.println(Arrays.toString(res)); 
        }
}
