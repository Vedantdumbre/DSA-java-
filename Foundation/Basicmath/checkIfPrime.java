public class checkIfPrime {

    public static void main(String[] args) {
        System.out.println(isPrime(98));
    }

    public static boolean isPrime(int n ){
        int i =1;
        int count =0;
        for(i=1;i<=n;i++){
            if (n%i==0) {
                count++;
            }
        }
        return count==2;
    }


}
