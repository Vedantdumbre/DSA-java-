// CONDITIONALS IN JAVA
public class basics4 {
    public static void main(String[] args) {
         int math = 78;
         int science = 80; 
         int geography = 90; 

         if (math +science +geography >= 40){
            if (math >= 33)
            System.out.println("pass in math ");
            else if (science >= 33)
            System.out.println("pass in science ");
            else if (geography >= 33)
            System.out.println("pass in geography ");
         }
         else{
            System.out.println("You are Failed");
         }
    }
}
