// Array basics :

import java.util.Arrays;

public class basics6 {
    public static void main(String[] args) {

// printing an array in reverse :        
        /*int[] arr = {10,20,30,40,50};
    // for (int i = 4;i<arr.length  ;i--){
    //     System.out.println(arr[i]);
    // }
    arr[0] = 23;  //updation in 0 index (from 10 to 23 )

    System.out.println(Arrays.toString(arr));  //how to displlay an array without loop  */

// Multidimensiona Array :
        /*int[][] ages ={{12,23,34},{21,34,33}};
        System.out.println(Arrays.deepToString(ages)); //how to display a 2d array without
        System.out.println(ages[0][0]); //here the ans will be 12. */
         /* here we can visuallize an array in this pattern:     [0] [1] [2]
                                                            [0]  |12  23  34 |
                                                            [1]  |21  34  33 |  */

// sum of an array :
        /*float[] arr= {10.5f,20,30,40,50}; // float in an array is writtenin this way     
        float sum = 0;

        for (float num : arr) {
            sum += num;
        }

        System.out.println("Sum of array: " + sum); //sum of an array  */

// program to fimd if an govem interger is present in an array or not :

        int[] arr = {10,20,30,40};
        int check = 95;
        boolean found = false;

        for (int i : arr) {
            if (i == check) {
                found = true; // 1.here the array will be confirming if it has the "check" or not.
                break;
            }
        }

        if (found) { // 2.Here the code will be giving its results.
            System.out.println("cool"); //great!😎
        } else {
            System.out.println("not cool");

        }
       

    } 
}
