class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
        val = 0;
        next = null;
        prev = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        prev = null;
    }

    ListNode(int data1, ListNode next1, ListNode prev1) {
        val = data1;
        next = next1;
        prev = prev1;
    }
}

public class insertingHeadinDLL {

    public ListNode insertBeforeHead(ListNode head, int X) {
        ListNode newNode = new ListNode(X);
        newNode.next = head;
        if (head != null) head.prev = newNode;
        newNode.prev = null;
        return newNode;
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " <-> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        insertingHeadinDLL obj = new insertingHeadinDLL();

        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.prev = head;

        head.next.next = new ListNode(30);
        head.next.next.prev = head.next;

        head.next.next.next = new ListNode(40);
        head.next.next.next.prev = head.next.next;

        head = obj.insertBeforeHead(head, 5);
        printList(head);
    }
}
