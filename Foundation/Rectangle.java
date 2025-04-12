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
public class Rectangle{
    
    void repeat(){
        for(int i=0;i<=5;i++){
            System.out.println(3);
        }

    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.repeat();
    }
}