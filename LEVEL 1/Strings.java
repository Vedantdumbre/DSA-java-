//string ae a set of characters that are written in btwn double quotes 
//ex - var name = "hello world!"
public class Strings {
    public static void main(String[] args) {
        //tocheck the length of the string
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the txt string is: " + txt.length());
    //to convert string to uppercase and lowercase
    String txt1 = "Hello World";
    System.out.println(txt1.toUpperCase());   
    System.out.println(txt1.toLowerCase());
    //to find the index of a specific character in the string based on indexing
    String txt2 = "Please locate where 'locate' occurs!";
System.out.println(txt2.indexOf("P lease"));
    }
}
