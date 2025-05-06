public class GCD {
        public static void main(String[] args) {
            System.out.println(gcd(28, 36));
        }
        public static int gcd(int n1, int n2) {

            while(n2!=0){    //Euclidean Algorithm:  for more info ask chatgpt for simplification.
                int temp= n2;
                n2 = n1 % n2;
                n1=temp;
            }
            return n1;
        }


}
