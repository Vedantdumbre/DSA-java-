public class Alldivisiblenumber {  // Quite Simple ✨✨
    public static void main(String[] args) {
        int[] result = divisors(24);
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    public static int[] divisors(int n) {
        int count = 0;

        // Step 1: Count how many divisors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        // Step 2: Create array of that size
        int[] result = new int[count];
        int index = 0;

        // Step 3: Store the divisors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result[index] = i;
                index++;
            }
        }

        return result;
    }
}
