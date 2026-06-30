// Operators and Expression 

import java.util.Scanner;

public class basics2 {
    public static void main(String[] args) {
//here i wrote a simple incremented value of a :

        // int a = 4;
        // System.out.println(a++);

// Finding the value of "x":
        // int y =7;
        // int x = ++y * 8;
        // System.out.println(x);

//checkign if a given number is greater than the user entered number or not :

        // int a = 14;
        // Scanner S = new Scanner(System.in);
        // int b = S.nextInt();
        // S.close();
        // if (a>b) {
        //     System.out.println("You Succed");
        // }
        // else {
        //     System.out.println("You Failed");
        // }

// Chatgpt question1:

        /*Scanner S = new Scanner(System.in);
        int num = S.nextInt();
        S.close();
                // Nested ternary op.
        String result = (num > 0)? "Positive"
                        :(num < 0)? "Negative"
                        : "Zero";

                        System.out.println(result); */


        
        int a = 15;
        int b = 8;
        int c = 20;
                // Nested ternary op.
        int result = (a>b && a>c)? a
                        :(b>a && b>c)? b
                        : c;

                        System.out.println(result);
    }
}
