import java.util.Stack;

public class QueuesusingStack {
    private Stack<Integer> s1,s2;
     public QueuesusingStack() {
        s1= new Stack<>();  // for taking inputs 
        s2= new Stack<>();  // for giving outputs 
    }

    public void push(int x) {
       s1.push(x);
    }

    public int pop() {
      if(isEmpty()) return -1;
      if(s2.isEmpty()){
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
      }
      return s2.pop();
    }

    public int peek() {
        if(isEmpty()) return -1;
        if(s2.isEmpty()){
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
      }
      return s2.peek();
    }

    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
