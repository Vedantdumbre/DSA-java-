//LOOP CONTROL STATEMENT:

public class basics5 {
    public static void main(String[] args) {
// printing nunbers from 100 to 200 using while loop :
        /*int i = 100;
        while (i <= 200) {
            System.out.println(i);
            ++i;
        }*/
// print first n natural numbers using do-while loop :
        /*int i = 1;
        int n = 11;
        do{
            System.out.println(i);
            ++i;
        }while( i > 0 && i <n );*/
// first n odd numbers using for loop:
        /*int n = 10; // number of odd numbers to print
        for (int i = 1; i <= 2*n; i += 2){
            System.out.println(i);
        } */
// first n numbers using for loop:
        /*for(int i = 10 ;i>=1;i--){
            System.out.println(i);
        }*/
//printing a triangle :
        /*for (int i =4 ;i>=1;i--) {
            for (int j = 1; j <= i; j++) {  
                System.out.print("*");
            }
            System.out.println();// here in this code we can see i, j. "i" looks after the number of lines of the pyramid and "j" looks after the number of "*" willbe printing in the code by doing (j<=i).Simple
        }  */
//  printing the sum of first n even numbers using while loop :
       /* int n = 7;
        int sum= 0, count = 0, num = 2; 
        while (count<n){
           sum += num;
           num += 2;
           count++;}
        System.out.println(" sumof first n numbers is "+ sum); */
// Multiplication table of a number in reverse :
        /*int n =10;
        for (int i = 10; i >= 1 ; i--) {
            System.out.println(n*i);
        } */
// repeating 5 in for and while loop :
        /*int n = 5;
        int i = 0 ;
        while (i<=10){
            System.out.println(n);  // done easy 👍😎
            i++;
        } 
        for (i = 0 ;i<=10;i++){
            System.out.println(n); // done easy 👍😎
        }*/
// printing the sum of a multiplication table :
        /*int n =403,sum=0;
        for (int i = 1; i <= 10 ; i++) {
            sum += n*i;
            
        }
        System.out.println(sum);  */
// printing a solid rectangle pattern :
         /*for (int i =1 ;i<=4;i++){
            for(int j=1;j<=9;j++){
                System.out.print("*");
                }
                System.out.println("*");
            } */
// pritning a hollow rectangle:
            /*int rows = 4,cols =5;
            for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            }*/
// printing a half pyramid:

            for(int i =0;i <=4;i++ ){
                for(int j =1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println("*"); //easy 😎👍
            }

         }   
    } 

