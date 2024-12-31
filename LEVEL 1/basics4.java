//1. Break statements in whilw loop

/*public class BreakAndContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
          System.out.println(i);
          i++;
          if (i == 4) {
            break;
          }
        }  
      }
}*/


//2. Continue statements in while loop
public class basics4 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
          if (i == 4) {
            i++;
            continue;
          }
          System.out.println(i);
          i++;
        }  
      }
}