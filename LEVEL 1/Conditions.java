//java me jab bhi agar-magar me baate karni hoti hai tab hum if/if-else/else-if ka use karte hai 

//1A. If statement -> java me jab bhi kisi code me ek hi condition se code ko pass karna hota hai to if use karte hai 
// Java program to illustrate If statement
/*public class Conditions {
    public static void main(String args[])
    {
        int i = 10;
   
        // using if statement
        if (i < 15)
            System.out.println("10 is less than 15");
   
        System.out.println("Outside if-block");
    }
 }*/

//1B. IF-else condition ->java me jab bhi code ko to conditions se pass karna hota hai tab hume if-else use karna chahiye 
/*  import java.util.*;
public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        sc.close();
    }
}*/


//2. Else if -> jab hume more than 2 conditions check karne ho tab hum else if use karte hai 
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

 //3.Switch statement -> switch statement hume ek code ke multiple posibilities dekhnekeliye use karte hai 
 // -> break statement ka use hum us statement se immidiate leave karne ke liye use karte hai  
  /*public class Conditions {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int button = sc.nextInt();

         switch (button) {
             case 1:
                 System.out.println("Namaste!");
                 break;             case 2:
                 System.out.println("Hello");
                 break;
             case 3:
                 System.out.println("Bonjour");
                 break;
             default:                 System.out.println("Invalid button");
         }

        sc.close();
        
     }
  }*/



