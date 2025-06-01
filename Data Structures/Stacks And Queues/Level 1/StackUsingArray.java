public class StackUsingArray {
    private int[] stack;
    private int top;

    public StackUsingArray() {
        stack = new int[1000]; // You can change the size as needed
        top = -1;
    }

    public void push(int x) {
        stack[++top] = x;
    }

    public int pop() {
        return top == -1 ? -1 : stack[top--];
    }

    public int top() {
        return top == -1 ? -1 : stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
     public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray();
        stack.push(10);
        stack.push(20);
        System.out.println("Top: " + stack.top());     // 20
        System.out.println("Pop: " + stack.pop());     // 20
        System.out.println("Pop: " + stack.pop());     
        System.out.println("Top: " + stack.top());     
        System.out.println("Is Empty: " + stack.isEmpty()); 
    }
}
