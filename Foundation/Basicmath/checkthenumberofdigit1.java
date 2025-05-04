public class checkthenumberofdigit1 { // Headache👍👍👍

    public static void main(String[] args) {
        System.out.println(countDigit(12345)); 
    }

    public static int countDigit(int n) {
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
