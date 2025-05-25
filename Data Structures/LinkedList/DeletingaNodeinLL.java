 class ListNode {
      int val;
     ListNode next;
      ListNode(int x) { val = x; }
 }

public class DeletingaNodeinLL {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;           // Copy next node’s value
        node.next = node.next.next;  
    }
}
