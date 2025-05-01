public class checkIfArraySorted {
    
// check if an array is sorted:  
    /*public static void main(String[] args) {
        int[] arr = {2,3,4,3,2};
        System.out.println(checkSort(arr));
    }

    static boolean checkSort(int[] arr){
        for(int i =1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
            
        }
        return true;
        
    } */

// to check if an array is sorted and rotated:LEETCODE✨  

        public static void main(String[] args) {
            int[] arr = {4,5,1,2};
            System.out.println(check(arr));
        }

        static boolean check(int[] arr){
            int count= 0;
            for (int i =1;i<arr.length;i++){
                int next = (i+1) % arr.length;
                if (arr[i] > arr[next] ){
                    count++;
                }
                
            }
            if(count<=1){
                return true;
            }
            else{
                return false;
            }
        }

}
