
class ListNode {
    int val;
    ListNode next;

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}

public class Segregate0s1s2s {
    public ListNode sortList(ListNode head) {
        ListNode zeroHead = new ListNode(-1);
        ListNode oneHead = new ListNode(-1);
        ListNode twoHead = new ListNode(-1);

        ListNode zero = zeroHead;
        ListNode one = oneHead;
        ListNode two = twoHead;
        ListNode temp = head;
        
        if(head == null || head.next==null ) return head;
        while(temp != null){
            if(temp.val == 0){
                zero.next=temp;
                zero=temp;
            }
            else if(temp.val == 1){
                one.next=temp;
                one=temp;
            }
            else {
                two.next=temp;
                two=temp;
            }
            temp =temp.next;
        }

        zero.next = (oneHead.next!=null)?oneHead.next:twoHead.next;
        one.next = twoHead.next;
        two.next=null;
        ListNode newNode = zeroHead.next;
        return newNode;
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Segregate0s1s2s obj = new Segregate0s1s2s();

        // Creating the linked list: 1 -> 2 -> 0 -> 1 -> 2
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(2);

        System.out.print("Original: ");
        printList(head);

        ListNode sorted = obj.sortList(head);

        System.out.print("Sorted: ");
        printList(sorted);
    }
}
