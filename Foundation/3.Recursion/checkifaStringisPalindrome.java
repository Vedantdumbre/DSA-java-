public class checkifaStringisPalindrome {
    public static void main(String[] args) {
        System.out.println(palindromeCheck("naan"));
        System.out.println(palindromeCheck("naanq "));
    }

    static boolean palindromeCheck(String s) {
        String rev = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return s.equals(rev);
    }
}

     

