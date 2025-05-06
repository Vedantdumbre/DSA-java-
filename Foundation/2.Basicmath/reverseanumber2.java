public class reverseanumber2 {
    
//TUF Problem:
        /*public static void main(String[] args) {
            System.out.println(reverseNumber(234));
        }
        public static int reverseNumber(int n) {
            int reverse=0;
            while(n>0){
                int lastDigit=n%10;
                reverse = (reverse * 10) + lastDigit;
                n = n /10;
            }
            return reverse;
        } */

// LEETCODE problem:Here we are reversing with a constraint *Careful* 👍
class Solution {
    
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
    public static int reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            int digit = x % 10;

            // Check for overflow before it happens
            if (reverse > Integer.MAX_VALUE / 10 || reverse < Integer.MIN_VALUE / 10) {
                return 0;
            }

            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        return reverse;
    }
}

    
}
