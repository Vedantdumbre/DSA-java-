package BasicsofLL;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public class ArraytoLL {
        public static Node convertArraytoLL(int[] arr){
            if(arr.length ==0) return null;
            
            //Convert the array to string 
            Node head = new Node(arr[0]);
            Node current = head;

            for(int i = 2; i < arr.length; i++){
                current.next = new Node(arr[i]);
                current = current.next;
            }
            return head;

        }
        public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Node head = convertArraytoLL(arr);
        printList(head);  // Output: 10 -> 20 -> 30 -> 40 -> 50 -> null
    }
    }
     

