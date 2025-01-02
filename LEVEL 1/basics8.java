public class basics8 {
    public static void main(String[] args) {
//1.method scoped
        // Code here CANNOT use x
    
        int x = 100;
    
        // Code here can use x
        System.out.println(x);
      }
      
//2.blocked scope
       // Code here CANNOT use x

    { // This is a block

        // Code here CANNOT use x
  
        int x = 100;
  
        // Code here CAN use x
        System.out.println(x);
  
      } // The block ends here
  
    //
      
      
}
