
//1. IF-else condition
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
 import java.util.*;
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

