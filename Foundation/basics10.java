// /Encapsulation & Polymorphism :

// / 1. Encapsulation : 
public class basics10 {
    private String name;

    public void setName(String newName){
        name=newName;
    }
    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        basics10 obj = new basics10();
        obj.setName("ved");
        System.out.println(obj.getName());
    }

}
