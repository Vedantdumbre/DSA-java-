class LinkedListStack {
    private class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    private Node top;

    public LinkedListStack() {
        top = null;
    }

    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top == null) return -1;
        int val = top.val;
        top = top.next;
        return val;
    }

    public int top() {
        return top == null ? -1 : top.val;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
