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
public class Add1inLL {
    private int helper(ListNode temp) { // this is a helper function 
        if (temp == null) 
            return 1;
        int carry = helper(temp.next); 
        
        /* Add the carry 
        to the current node's value */
        temp.val += carry; //if the val is more than 10 then return 0
        if (temp.val < 10) 
            return 0;
        temp.val = 0; 
        return 1;
    }
    public ListNode addOne(ListNode head) {
        int carry = helper(head);
        if(carry==1) {
            ListNode newNode = new ListNode(1);
            newNode.next =head;
            head=newNode;
           } 
           return head;
    }
}
