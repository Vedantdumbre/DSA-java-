
public class DeleteHeadofLL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        Node deleteHead(Node head){
            if(head == null) return null; // If the list is empty, return null
            Node temp = head.next;// Delete the current head
            return temp; // Return the new head
        }
        static void  printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
        }
        
        public static void main(String[] args) {
        DeleteHeadofLL obj = new DeleteHeadofLL();

        // Creating nodes
        Node head = obj.new Node(10);
        head.next = obj.new Node(20);
        head.next.next = obj.new Node(30);
        head.next.next.next = obj.new Node(40);

        System.out.print("Original List: ");
        printList(head);

        // Delete head
        head = obj.deleteHead(head);

        System.out.print("After Deleting Head: ");
        printList(head);
    }
        
        
    
    
}
