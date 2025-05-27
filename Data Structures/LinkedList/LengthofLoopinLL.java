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

public class LengthofLoopinLL {
    public int findLengthOfLoop(ListNode head) {
        int count=0;
        ListNode slow =head;
        ListNode fast =head;
        while(fast!=null && fast.next!=null ){
            slow= slow.next;
            fast= fast.next.next;
            if(slow==fast) {
                slow=head;
                while(slow!=fast){
                slow= slow.next;
                fast= fast.next;
                }
                return count;
            };
        }
        return -1;
    
     }
}
