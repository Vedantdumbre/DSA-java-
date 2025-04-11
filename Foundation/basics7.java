// Methods :

public class basics7 {
// Running a simple method.
    /*static void myClass(String name){
        System.out.println("This is my Method:" + name); // how to create a simple method
    }

    public static void main(String[] args) {
        myClass("joe"); //how to print a method 
    }  */

// A exmple of method overloading
    /*static int add1(int a,int b ){
      return a+b;
    }

    static double add1(double a,double b ){
      return a+b;
    }
    public static void main(String[] args) {
      System.out.println(add1(1.22,20.34765 )); //easy😎😎
      System.out.println(add1(1.2,20 ));
      
    } */

// factorial of a nunber using "recursion" :

        /*public static void main(String[] args) {
            int result = Factorial(3);
            System.out.println(result);
        }
    
        public static int Factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;  // Base case
            }
            return n * Factorial(n - 1);  // Recursive call
        }*/

// multiplication table:  
      
    /*static void  table(int n){
      for(int i=10;i>=1;i--){
        System.out.println(n*i);
        
        }
      }


      public static void main(String[] args) {
        table(4);
      } */

// printing a pattern :

    /*static void pyramid(){
      for(int i=5;i >=0;i-- ){
        for (int j=1;j<=i;j++){
          System.out.print("* "); //easy 😎😎
        } 
        
        System.out.println();
      }
      
    }
    public static void main(String[] args) {
      pyramid();
    } */

// recursion program for finding the sum of n natural numbers:
    /*public static void main(String[] args) {
      int result = Sum(19);
      System.out.println(result);
    }

    static int Sum(int n) {
        if (n == 0) {
            return 0;  // Base case
        }
        return n + Sum(n - 1);  // Recursive sum calculation
    } */

// repeat 4 using recursion:
    public static void main(String[] args) {
      digit(9);  // here i will be telling how many times the number must be played. 
    }
    static int digit(int n) {
      if(n==0){
        return 0;
      }
      System.out.println(4); //here i will be telling which number to print  
      return digit(n-1);
    }

    }
