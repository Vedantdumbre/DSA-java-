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
    /*public static void main(String[] args) {
      digit(4);
    }
    static void digit(int n) {
      if(n==0){
        return ;
      }
      System.out.println(4);
      digit (n-1);
    } */

// average of numbers using functions :
    /*public static void main(String[] args) {
      float result =avg(10,20,30);
      System.out.println(result);
    }
        
    static  float avg(float a,float b,float c){  
        return (a+b+c)/3;
        } */

//Above question =>Using an array :
      /*static void  avg(){
        float[] arr = {10.9f,23,34};
        float sum = 0;
        for(float num : arr){
          sum += num;
        }
        System.out.println(sum);

      }

      public static void main(String[] args) {
        avg();
      } */

// funtion for converting celcius to fahrenheit:

    /*static void  converter(){
      float celsius = 32;
      float fahrenheit = (float) ((celsius * 9/5)+32);
      System.out.println(" Temp in fahrenheit is "+fahrenheit); //easy😎😎👍
    }

    public static void main(String[] args) {
      converter();
    } */


    
    }
