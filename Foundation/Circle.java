// This is a file where i am writing all the important questions regarding "oop in java".

//this is a n=basic code for testign my basic skills.
/*public class Employee {

    int Salary = 50000;
    String name ="Ved";

     void getSalary(){
        System.out.println("Salary is: " + Salary);
    }

    void getName(){
        System.out.println("Name is: " + name);
    }

    void setName(){
        name =" vedant";
        System.out.println("Name is: " + name);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getSalary();
        emp.getName();
        emp.setName();
    } 


} */

//here in this question we are printing two of the properties by using methods and object.
/*public class cellphone{
    String ring = "ringing...";
    String vibrate = "vibrating...";

     void toRing(){
        System.out.println("property one:"+ring);
    }

     void toVibrate(){
        System.out.println("property two:"+vibrate);
    }

    public static void main(String[] args) {
        cellphone cell = new cellphone();
        cell.toRing();
        cell.toVibrate();
    }
} */

// Program to repeat 3 
/*public class Rectangle{
    
    void repeat(){
        for(int i=0;i<=5;i++){
            System.out.println(3);
        }

    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.repeat();
    }
} */


// Inheritance example :
// correct way to run the command of inheritance is to type "java Dog".here Dog will be targette dand the required result will be appeared.
/*public class Animal {
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
    
    public static void main(String[] args) {
        Cat myObj  = new Cat();
        myObj.sound();
    }
} */

// A detailed question for what i learned until now :
public class Circle{

    void shape(){
        System.out.println("Circle has no edged");
    }
}
class Cylinder extends Circle{
    void AreaVolume(){
        System.out.println("Area & Volume of Cylinder :");
    }   
    public int getValues(int area, int volume){
        return area*volume;  // this the way of creatign a getter
    }
    public int setValues(int newarea, int newvolume){
        return newarea*newvolume; // this the way of creatign a setter
    }

    public static void main(String[] args) {
        Cylinder myObj = new Cylinder();
        myObj.shape();
        myObj.AreaVolume();
        int result1=myObj.getValues(5,10); // call the getter in this way
        int result2=myObj.setValues(8,8);  // call the setter in this way
        System.out.println(result1);
        System.out.println(result2);
    }
}



