
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
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.next = third;
        System.out.println(head.data);
        System.out.println(second.data);
        System.out.println(third.data);
        System.out.println(head.next);
       
    }

}
