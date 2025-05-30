class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}

// the solution 
public class InsertingHeadinLL {
    public  ListNode insertAtHead(ListNode head, int X) {
       ListNode newnode = new ListNode(X);
       newnode.next = head;
       head=newnode;
       return head;
    }

// prinying the linked list
    static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        InsertingHeadinLL obj = new InsertingHeadinLL();

        // Creating nodes
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);

        System.out.print("Original List: ");
        printList(head);

        // Insert at head
        head = obj.insertAtHead(head, 4);

        System.out.print("After Inserting at Head: ");
        printList(head);
    }
}
