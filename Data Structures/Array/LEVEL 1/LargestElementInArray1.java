public class LargestElementInArray1 {

// finding maximum number in an array: 
    
    public static void main(String[] args) {
        int[] arr = {2,3,4,8,6};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int maxVal = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }

    // reversing an array :

    /*public static void main(String[] args) {
        int[] arr = {1,3,5,7,5};
        reverse(arr);
    }

    static void reverse(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    } */

}