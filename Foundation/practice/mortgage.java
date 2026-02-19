import java.util.Scanner;

public class Mortgage {
     public static void main(String[] args) {
      double principle =0;
      double interestRate =0;
      double period =0;

        Scanner sc = new Scanner(System.in);
        
        // user providing values 
        while(true){ // checking if the user input is valid
            System.out.print("Principle ($1K - $1M): ");
            principle = sc.nextDouble();
            if(principle >= 1000 &&  principle <= 1000000)
               break;
             System.out.println("Enter a value between 1,000 and 1,000,000");
         }

        while(true){ // checking if the user input is valid
            System.out.print("Annual Interest rate: ");
            interestRate = sc.nextDouble();
            if(interestRate >=1 && interestRate <= 30)
               break;
            System.out.println("Enter a value that is greater than 0 and less than or equal to 30 ");
         }

         while(true){  // checking if the user input is valid
            System.out.print("Period: ");
            period = sc.nextDouble();
            if(period >= 1 && period <= 30)
               break;
            System.out.println("Enter a value that is greater than 0 and less than or equal to 30 ");
         }

        // calculating the Mortafge per month 
        double r = (interestRate/100)/12;
        double n = period*12;

         // dividing numerator and denominator 
        double numerator = r*Math.pow(1+r,n);
        double denominator = Math.pow(1+r,n)-1;
        
        double monthlyMortage = principle*( numerator/denominator );

        System.out.println("Mortgage: $"+monthlyMortage);
        sc.close();
     }
}
