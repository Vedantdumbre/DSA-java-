import java.util.Scanner;

public class Mortgage {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // user providing values 
        System.out.print("Principle: ");
        double principle = sc.nextDouble();

        System.out.print("Annual Interest rate: ");
        double interestRate = sc.nextDouble();

        System.out.print("Period: ");
        double period = sc.nextDouble();

        // calculating the Mortafge per month 
        double r = (interestRate/100)/12;
        double n = period*12;

        double numerator = r*Math.pow(1+r,n);
        double denominator = Math.pow(1+r,n)-1;
        
        double monthlyMortage = principle*( numerator/denominator );

        System.out.println("Mortage: $"+monthlyMortage);
        sc.close();
     }
}
