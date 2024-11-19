import java.util.*;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // To find a number is odd or even number
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        sc.close();
    }
}



