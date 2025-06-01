class Node {
    int val;
    Node next;
    Node(int d) {
        val = d;
        next = null;
    }
}
class LinkedListQueue {
    private Node front,rear;
     public LinkedListQueue() {
        front = rear = null;
    }

    public void push(int x) {
       Node newNode = new Node(x);
       if(rear==null){
        front= rear = newNode;
       }else{
        rear.next=newNode;
        rear=newNode;
       }
    }

    public int pop() {
      if(front == null) return -1;
      int val = front.val ;
      front = front.next;
      if(front == null) rear = null;
      return val;
    }

    public int peek() {
        return front == null ? -1:front.val;
    }

    public boolean isEmpty() {
        return front == null;
    }
}
