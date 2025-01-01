public class bas {
    /*static void mymethod() {
        System.out.println("I just got executed!");
    }
    public static void main(String[] args) {
        mymethod();
        mymethod();
        mymethod();
    }*/

    // when u have to insert a paarmeter in a method
    static void myMethod(String fname) {
        System.out.println(fname + " hello");
      }
    
      public static void main(String[] args) {
        myMethod("ved");
        myMethod("atharva");
        myMethod("adi");
      }
}
