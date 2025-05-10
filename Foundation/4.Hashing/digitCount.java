import java.util.Scanner;

public class digitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s=sc.next();

        // pre storing
        int[] hash = new int[256]; 
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)]++;
        }

        int q;
        q=sc.nextInt();
        while(q-->0){
            char c;
            c=sc.next().charAt(0);
            System.out.println(hash[c]);
        }
        
        sc.close();
    }
}
