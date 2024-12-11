//java me jab bhi agar-magar me baate karni hoti hai tab hum if/if-else/else-if ka use karte hai 




//1B. IF-else condition
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
 /*import java.util.*;
 public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        if (button == 1){
            System.out.println("Namaste!");
        }
        else if (button == 2){
            System.out.println("Hello");
        }
        else if (button == 3){
            System.out.println("Bonjour");
        }
    }
 }*/

 //3.Switch statement
 public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Namaste!");
                break;
            case 2:
                System.out.println("Hello");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid button");
        }

        sc.close();
        
    }
 }

 //1A. If statement
// Java program to illustrate If statement
 public static void main(String args[])
 {
     int i = 10;

     // using if statement
     if (i < 15)
         System.out.println("10 is less than 15");

     System.out.println("Outside if-block");

     // both statements will be printed
 }