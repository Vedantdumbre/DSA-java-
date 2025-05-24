import java.util.ArrayList;
import java.util.List;


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
public class SegregateOddandEven2 {
     public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        // To store values
        List<Integer> array = new ArrayList<>();   
        ListNode temp = head;

        /*Traverse the list, skipping one node, 
        and store values in the vector*/
        while (temp != null && temp.next != null) {
            array.add(temp.val);
            temp = temp.next.next;
        }

        /*If there's an even number 
        of nodes, add the value
         of the last node*/
        if (temp != null)
            array.add(temp.val);

        // Reset temp 
        temp = head.next;

        /*Traverse the list again, skipping one node,
         and store values 
        in the vector*/
        while (temp != null && temp.next != null) {
            array.add(temp.val);
            temp = temp.next.next;
        }

       /* If there's an odd number
        of nodes, add the 
        value of the last node*/
        if (temp != null)
            array.add(temp.val);

        // Reset temp 
        temp = head;
        int i = 0;

        // Update node values 
        while (temp != null) {
            temp.val = array.get(i);
            temp = temp.next;
            i++;
        }

        return head;
    }
}
