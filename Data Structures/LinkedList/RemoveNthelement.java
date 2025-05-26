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

public class RemoveNthelement {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);  // Use dummy to handle edge cases
        ListNode fast = dummy, slow = dummy;

        // Move fast n+1 steps
        for (int i = 0; i <= n; i++) {
            if (fast != null) fast = fast.next;
        }

        // Move both pointers
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Delete node
        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        RemoveNthelement obj = new RemoveNthelement();

        // Creating the linked list: 1 -> 2 -> 0 -> 1 -> 2
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(2);

        System.out.print("Original: ");
        printList(head);

        head = obj.removeNthFromEnd(head, 5); // Remove 2nd from end

        System.out.print("After Removal: ");
        printList(head);
    }
}
