public class Palindrome3 {
    
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int n) {
        int reverse =0;
        int original = n;
        while(n>0){
            int digit = n %10;
            reverse = reverse*10 + digit;
            n=n/10;
        }
        return original==reverse;
    }


}
