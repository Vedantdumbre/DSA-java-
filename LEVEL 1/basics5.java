//1A.widening casting -> automati  casting
/*public class Typecasting {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
    
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
      }
} */


//1B.shortning/Narrowing casting -> must be done manully by placing the type in paranthesis ()
public class basics5{
public static void main(String[] args) {
    double myDouble = 9.78d;
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
  }
}