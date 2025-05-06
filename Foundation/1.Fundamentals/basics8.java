// OBJECT-ORIENTED PROGRAMMING:

public class basics8 {  //this is called the "class"
    //these are attributes
    int x = 5; 
    int y = 10; 

    public static void main(String[] args) {
        basics8 obj1 = new basics8();
        basics8 obj2 = new basics8();   //this is how "object" is created.
        obj1.x = 20; //this is how you "change the value" of an attribute
        System.out.println(obj2.y);
        System.out.println(obj1.x); //this is how you can call a "object" with "attributes" needed.
    }
    
}

class second{  // this is how we should make a second class.

}
