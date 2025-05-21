
public class ClassinLinkedlist {
  
    static class Node{
    int data ;
    Node next;

    Node(int data ){
        this.data = data;
        this.next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        System.out.println(head.data);
    }

}
