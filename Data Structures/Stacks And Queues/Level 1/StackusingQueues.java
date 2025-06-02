import java.util.LinkedList;
import java.util.Queue;

public class StackusingQueues {
    private Queue<Integer> q1,q2;
    public StackusingQueues() {
        q1 = new LinkedList<>(); // primary queue (acts like a stack )
        q2 = new LinkedList<>(); // secondary queue (helper queue)
    }

    public void push(int x) {
       q2.add(x);
       while(!q1.isEmpty()){
        q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
      return q1.isEmpty() ? -1 : q2.remove();
    }

    public int top() {
        return q1.isEmpty() ? -1 : q2.peek();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }
}
