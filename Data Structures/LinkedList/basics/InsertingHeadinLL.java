public class InsertingHeadinLL {
    public ListNode insertAtHead(ListNode head, int X) {
       ListNode newnode = new ListNode(X);
       newnode.next = head;
       head=newnode;
       return head;
    }
}
