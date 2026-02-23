import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input from the user
        System.out.print("Number: ");
        int num = sc.nextInt();

        //Performing logic 
        if(num % 5==0 && num % 3==0) // adding this first bcoz of the constraints 
            System.out.println("FizzBuzz");
        else if (num % 5 ==0 )
            System.out.println("Fizz");
        else if (num % 3 ==0 )
            System.out.println("Buzz");
        else
            System.out.println(num);
        sc.close();

    }
}
