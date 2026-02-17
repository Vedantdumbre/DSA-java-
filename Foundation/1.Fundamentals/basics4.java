// CONDITIONALS IN JAVA
public class basics4 {
    public static void main(String[] args) {

// here is calculating the result of the student using operators and conditionals:

        //  int math = 78;
        //  int science = 80; 
        //  int geography = 90; 
        //  int total = math + science + geography;

        //  if (total >= 40 && math >= 33 && science >= 33 && geography >= 33){
        //     System.out.println("You are Pass!");
        //  }
        //  else{
        //     System.out.println("You are Failed");
        // }

// tax payable for the employee :


        /*double income = 7.5;

        if (income <= 2.5) 
            System.out.println("No tax");
        else if (income <= 5.0) 
            System.out.println("5%");
        else if (income <= 10.0) 
            System.out.println("20%");
        else 
            System.out.println("30%");*/

            /*class Solution {
                static void studentGrade(int marks) {
                    if (marks >= 90) {
                        System.out.println("Grade A");
                    } else if (marks >= 70) {
                        System.out.println("Grade B");
                    } else if (marks >= 50) {
                        System.out.println("Grade C");
                    } else if (marks >= 35) {
                        System.out.println("Grade D");
                    } else {
                        System.out.println("Fail");
                    }
                }
            
                public static void main(String[] args) {
                    studentGrade(69);
                }
            } */
            
            /*int temp = 3;
            if(temp > 30){
                System.out.println("It's a hot day!");
                System.out.println("Drink plenty of water.");
            }
            else if(temp >= 20)
                System.out.println("It's a nice day!");

            else 
                System.out.println("It's cold!");
            } */
            

            // example of Simplified if statement
            int income = 120_000;
            boolean hasHighIncome = (income > 100_000) ;// adding this to simplify the code
            System.out.println(hasHighIncome);

            // Another example but, using ternary operator to simplify the code more:
            String className = income > 100_000 ? "First" : "Economy"; // this is called ternary operator in if statement
            System.out.println(className);

            

        }
    }


    