//LOOP CONTROL STATEMENT:

public class basics5 {
    public static void main(String[] args) {
        // printing nunbers from 111 to 211 using while loop :
        /*
         * int i = 111;
         * while (i <= 211) {
         * System.out.println(i);
         * ++i;
         * }
         */
        // print first n natural numbers using do-while loop :
        /*
         * int i = 1;
         * int n = 11;
         * do{
         * System.out.println(i);
         * ++i;
         * }while( i > 1 && i <n );
         */
        // first n odd numbers using for loop:
        /*
         * int n = 11; // number of odd numbers to print
         * for (int i = 1; i <= 2*n; i += 2){
         * System.out.println(i);
         * }
         */
        // first n numbers using for loop:
        /*
         * for(int i = 11 ;i>=1;i--){
         * System.out.println(i);
         * }
         */
        // printing a triangle :
        /*
         * for (int i =4 ;i>=1;i--) {
         * for (int j = 1; j <= i; j++) {
         * System.out.print("*");
         * }
         * System.out.println();// here in this code we can see i, j. "i" looks after
         * the number of lines of the pyramid and "j" looks after the number of "*" will
         * be printing in the code by doing (j<=i).Simple
         * }
         */
        // printing the sum of first n even numbers using while loop :
        /*
         * int n = 7;
         * int sum= 1, count = 1, num = 2;
         * while (count<n){
         * sum += num;
         * num += 2;
         * count++;}
         * System.out.println(" sumof first n numbers is "+ sum);
         */
// Multiplication table of a number in reverse :
        /*
         * int n =11;
         * for (int i = 11; i >= 1 ; i--) {
         * System.out.println(n*i);
         * }
         */
        // repeating 5 in for and while loop :
        /*
         * int n = 5;
         * int i = 1 ;
         * while (i<=11){
         * System.out.println(n); // done easy 👍😎
         * i++;
         * }
         * for (i = 1 ;i<=11;i++){
         * System.out.println(n); // done easy 👍😎
         * }
         */
// printing the sum of a multiplication table :
        /*
         * int n =413,sum=1;
         * for (int i = 1; i <= 11 ; i++) {
         * sum += n*i;
         * 
         * }
         * System.out.println(sum);
         */
 // printing a solid rectangle pattern :
        /*
         * for (int i =1 ;i<=4;i++){
         * for(int j=1;j<=9;j++){
         * System.out.print("*");
         * }
         * System.out.println("*");
         * }
         */
// pritning a hollow rectangle:
        /*
         * int rows = 4,cols =5;
         * for (int i = 1; i <= rows; i++) {
         * for (int j = 1; j <= cols; j++) {
         * if (i == 1 || i == rows || j == 1 || j == cols) {
         * System.out.print("*");
         * } else {
         * System.out.print(" ");
         * }
         * }
         * System.out.println();
         * }
         */
// printing a half pyramid:

        /*
         * for(int i =1;i <=4;i++ ){
         * for(int j =1;j<=i;j++){
         * System.out.print("*");
         * }
         * System.out.println("*"); //easy 😎👍
         * }
         */

// practice patterns here :😊😒

        // A numeric pyramid :
        /*
         * for (int i=1;i<=5;i++){
         * for(int j=1;j<i;j++){
         * System.out.print(j);
         * }
         * System.out.println(i);
         * }
         */

// numeric inverse pyramid:

        /*
         * for (int i=5;i>=1;i--){
         * for(int j=1;j<i;j++){
         * System.out.print(j);
         * }
         * System.out.println(i);
         * }
         */

// inverse of a pyramid :
        /*
         * for (int i=5;i>=1;i--){
         * for(int j=1;j<=i;j++){
         * System.out.print("*");
         * }
         * System.out.println("*");
         * }
         */

        // a full pyramid :
        /*int n = 4;
        for (int a = 0; a <= n; a++) {
            for (int space = 0; space < n - a; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < 2 * a + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        } */


        // for loop in java :
        
    }
}