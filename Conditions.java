
//1. IF condition
// import java.util.*;

// public class Conditions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // To find a number is odd or even number
//         int num = sc.nextInt();
//         if (num % 2 == 0) {
//             System.out.println("The number is even.");
//         } else {
//             System.out.println("The number is odd.");
//         }

//         sc.close();
//     }
// }

//2. Else if 
 import java.util.*;
 public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b){
            System.out.println("Both numbers are equal");
        }
        else if (a > b){
            System.out.println("A is greater than B");
        }
        else {
            System.out.println("B is greater than A");
        }
    }
 }

