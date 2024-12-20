public class methods {
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
        System.out.println(fname + " Refsnes");
      }
    
      public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
      }
}
