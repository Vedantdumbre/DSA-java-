// ABSTRACT CLASSES AND INTERFACES :

//example of abstract class :
/*public class basics11 {

    abstract static class Pen { //creation of a " abstract class "
        abstract void write(); // creating a "absrtact method"

        void writing() {
            System.out.println("Writing");
        }

        abstract void refill();  // creating a "absrtact method"

        void ink() {
            System.out.println("ink");
        }
    }

    static class Marker extends Pen { // while using abstract classes it is imp to use inheritance . only "single inheritance" can be used 
        void write() {
            System.out.println("from pen - write");
        }

        void refill() {
            System.out.println("from pen - refill");
        }
    }

    public static void main(String[] args) {
        Marker marker = new Marker();
        marker.write(); // calling the "child class" first 
        marker.ink();  // the calling "parent class"
        marker.refill();
        marker.writing();
        
    }
} */


//example of interface:
/*interface Animal {  //interface class
    void jump(); // interface method (this mehtod cannot create objects of their own like "abstract")
    void bite(); // interface method (this mehtod cannot create objects of their own like "abstract")
    
    
}

public class Human implements Animal{
    public void jump() {
        System.out.println("Human is jumping");
    }
    public void bite() {
        System.out.println("Human is bitting");
    }
    public void eat() {
        System.out.println("Human is eat");
    }
    public void sleep() {
        System.out.println("Human is sleeping");
    }

    public static void main(String[] args) {
        Human human = new Human();
        human.bite();
        human.jump();
        human.sleep();
    }

}*/
    




