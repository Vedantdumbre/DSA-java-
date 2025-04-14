// ACCESS MODIFIER :


// A simpe example of access modification.
public class baiscs9 {
    private int id;
    private String name;
    private int Salary;

    public String getName(){
        return name ;
    }
    public void setName(){
        this. name="ved";
        this. id=07;
    }
    public void setName(String n,int a){ // the "setName" above gets "overloaded" by this "setName".
        this. name=n;
        this. id=a;
        System.out.println(n);
        System.out.println(a);
    }
    public baiscs9(int update){
        this.Salary=update;
        System.out.println(update);
    }

    public static void main(String[] args) {
        baiscs9 obj = new baiscs9(10000);
        obj.setName("ved", 7);
    }
}
