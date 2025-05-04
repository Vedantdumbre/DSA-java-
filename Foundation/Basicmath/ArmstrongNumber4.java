public class ArmstrongNumber4 {
    public static void main(String[] args) {
        System.out.println(isArmstrong(370));  // true
        System.out.println(isArmstrong(3));    // true
    }

    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int numDigits = (int) Math.log10(n) + 1;  // Count number of digits

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numDigits);  // Raise each digit to the power of numDigits
            n = n / 10;
        }

        return sum == original;  // Compare sum to original number
    }
}
