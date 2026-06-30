//SCANNERS in java

import java.util.Scanner;

public class basics1 {
    public static void main(String[] args) { // this is the example for "Scanners" . Used when user wants to give values from the keyboard
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int sum = a * b; 
        System.out.println(sum%100);
        s.close();   // Used to close the scanner. IMP

        // Trying ternary OP
        int trop = (a>b) ? a : b;
        System.out.println(trop);

    } 
}

