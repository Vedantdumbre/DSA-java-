public class SecondLargestInArray2 {
    
// finding the second largest in an array : easy😎😎

    public static void main(String[] args) {
        int[] arr = {2,3,4,86,78};
        System.out.println(smax(arr));
    }

    static int smax(int[] arr){
        int secondmax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){  
            if (arr[i]>max) {
                secondmax =max;
                max = arr[i];
            } 
            else if(arr[i]>secondmax && arr[i] !=max ){
                    secondmax = arr[i];
            }
        }
        return secondmax;
    }

}
