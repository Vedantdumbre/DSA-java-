public class QueuesUsingArray {
     private int[] queue;
    private int start, end;

    public QueuesUsingArray() {
        queue = new int[100];
        start = 0;
        end = 0;
    }

    public void push(int x) {
        queue[end++] = x;
    }

    public int pop() {
        return isEmpty() ? -1 : queue[start++];
    }

    public int peek() {
        return isEmpty() ? -1 : queue[start];
    }

    public boolean isEmpty() {
        return start == end;
    }
    public static void main(String[] args) {
        QueuesUsingArray stack = new QueuesUsingArray();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top: " + stack.peek());   // 10  
        System.out.println("Pop: " + stack.pop());     // 10
        System.out.println("Pop: " + stack.pop());     // 20
        System.out.println("Top: " + stack.peek());    // 30
        System.out.println("Is Empty: " + stack.isEmpty()); // false; 
    }
}
