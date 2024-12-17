//1A.For Loop -> If we have to run a code repeatedly until a certain condition we use for loop
/*public class Loops {
    public static void main(String[] args) {
        // Loop to print "Hello" 10 times
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
    }
}*/

//1B.Nested For Loop -> we run a for loop inside a for loop 
// public class Loops {
//     public static void main(String[] args) {
//         for (int i = 0; i < 11; i++){
//             System.out.println(i);
//             for (int j = 0; j < 11; j+=1){
//                 System.out.println(j);
//             }
//         }
//     }
// }

//1C.for each loop -> for each loop ko enhanced for loop bhi bolte hai , jab bhi hume array ko for loop ki madat se chala hota hai tab hum for loop use karte hai
public class For {
    public static void main(String[] args) {
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
