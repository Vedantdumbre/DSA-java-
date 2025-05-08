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
        /*public static void main(String[] args) {
           System.out.println(NnumbersSum(4));
        }
        public static int NnumbersSum(int N) {
           if(N==0) return 0;
           return N + NnumbersSum(N-1);
        } */
}
