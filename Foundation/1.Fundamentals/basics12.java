// TRY AND CATCH : 


public class basics12 {

//example of try-catch:
    /*public static void main(String[] args) {
        
        try {  // yaha pe ek aisa "varible" rakho jo error de sakta hai .
            int[] arr = {10,20,30,40,50};
            System.out.println(arr[10]);
        }
        catch (Exception e) {  // yahape ek "exception catch karo" and use tackle karne ke liye "ek particular text display karo "
            System.out.println("Something went wrong!");
        }
        finally{  // "finally" ka use hamesha ek "end me ek line/ ending msg "print karne ke liye hota hai 
            System.out.println("This is finally block");
        }
    }*/
    
// example of throw  :
        
        public static void checker(){
            int a =23;
            try{
                if(a!=25){
                    throw new ArithmeticException("haha");  // this is how throw is used 
                }
                else if(a/0==3){
                    throw new IllegalArgumentException("hehe");
                }  
                else{
                    System.out.println("no exception");
                }
            }
            catch(Exception e){
                System.out.println("Caught: " + e); 
            }
        }

        public static void main(String[] args) {
          checker();
        }
}
