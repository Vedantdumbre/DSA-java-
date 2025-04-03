//SCANNERS in java

import java.util.Scanner;

public class basics1 {
    public static void main(String[] args) { // this is the example for "Scanners" . Agar hume keyboard se koi value pick karni ho👍 
        Scanner S = new Scanner(System.in);
        int a = S.nextInt();
        int b = S.nextInt();
        int c = S.nextInt();
        int d = S.nextInt();
        int e = S.nextInt(); 
        S.close();
        int sum = a + b +c +d+e;
        System.out.println((sum / 5) * 100 );
    }
}

