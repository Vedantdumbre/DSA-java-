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
public class RemoveDuplicateinDLL {
    public ListNode removeDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode nextNode = temp.next;
        ListNode prevNode = temp.prev;

        if(temp.val == temp.next.val){
            if(temp==head){
                head=temp.next;

                if(nextNode!=null){
                    nextNode = prevNode;
                }
                if(prevNode!=null){
                    prevNode = nextNode;
                }
            }
            }else{
                temp=temp.next;
            }
            return head;
    }
}
