
//Return Statements in java are like calling a normal method (function ) and then whatever code is written furter will be ignored by the code editor .

 public class basics3 {
    public static void main(String[] args) {
        String msg = hello();
        System.out.println(msg);
    }

    static String hello() {
        String greet = "how r u ?";
        return greet; 
    }
}
