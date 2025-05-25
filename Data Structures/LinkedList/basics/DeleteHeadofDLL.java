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

public class DeleteHeadofDLL {
    public ListNode deleteHead(ListNode head) {

        if (head == null) return null; // ✅ If list is empty, return null

    ListNode temp = head.next;     // Move to the next node
    if (temp != null) temp.prev = null; // ✅ Set new head's prev to null

    return temp;  // Return the new head
    }
}
