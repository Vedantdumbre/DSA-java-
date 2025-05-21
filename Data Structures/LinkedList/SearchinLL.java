public class SearchinLL {
      static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static boolean search(Node head, int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == target) return true;  // mil gaya
            temp = temp.next;
        }
        return false;  // pura list check kar liya, nahi mila
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(10);
        head.next.next = new Node(15);

        int key = 12;
        if (search(head, key))
            System.out.println("Element found ");
        else
            System.out.println("Element not found ");
    }
}
