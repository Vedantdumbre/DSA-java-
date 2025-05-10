public class practiceRecursion1 {

//printing name N times:
    /*public static void main(String[] args) {
        name(0,5); 
    }

    static void name(int i,int n){
        if(i>=n) return;
        System.out.println("ved");
        name(i+1,n);
    } */

// print 1 to N :
    /*public static void main(String[] args) {
        print(1, 5);
    }
    static void print(int i,int n){
        if(i>n) return;
        System.out.println(i);
        print(i+1,n);
    } */

//printing N to 1 :
        /*public static void main(String[] args) {
            print(1, 5);
        }
        static void print(int i,int n){
            if(i>n) return;
            System.out.println(n);
            print(i,n-1);
        } */

// Sum of N numbers :
        /* public static void main(String[] args) {
           System.out.println(NnumbersSum(4));
        }
        public static int NnumbersSum(int N) {
           if(N==0) return 0;
           return N + NnumbersSum(N-1);
        } */ 

// Program to find Factorial number :
        /*public static void main(String[] args) {
            System.out.println(Factorial(5));
        }
        public static int Factorial(int N) {
            if(N==0) return 1;
            return N * Factorial(N-1);
        }  */ 

//program  to reverse an array :
        /*public static void main(String[] args) {
            reverse(new int[]{1,2,3,4,6}, 5);

        }
        public static void reverse(int[] arr, int n) {
            if (n == 0) return;
            System.out.print(arr[n - 1] + " ");
            reverse(arr, n - 1);
        } */
        

}
