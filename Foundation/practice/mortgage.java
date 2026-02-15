import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         //user providing the values 
         System.out.print("Principle: " );
         double principle = sc.nextDouble();

         System.out.print("Annual Interest Rate: " );
         double interestRate = sc.nextDouble();

         System.out.print("period: " );
         double period = sc.nextDouble();
         
         //started to calculate the morgage
         double r = (interestRate/100)/12 ;// having percent and then 12 is number of months
         double n = period * 12;// number of  months 

         double numerator =r * Math.pow((1+r),n);
         double denominator =Math.pow((1+r),n)-1;
         double MonthlyMortage = principle*(numerator/denominator);

         System.out.println("Mortage: $"+ (int)MonthlyMortage);
         sc.close();    
    }
}
