import java.util.*;

public class ImplementStackByQue {
    
static class MyStack {
    private Queue<Integer> que;

    public MyStack() {
        que = new LinkedList<>();
    }
    
    public void push(int x) {
        que.offer(x);
        int n = que.size() - 1;

       for(int i=0 ;i<n ;i++){
        que.offer(que.poll());
       }
    }
    
    public int pop() {
        return que.poll();
    }
    
    public int top() {
        return que.peek();
    }
    
    public boolean empty() {
     return que.isEmpty();
    }
};
    public static void main(String[] args) {
       MyStack s = new MyStack();
       s.push(1);
         s.push(2);
        s.push(3);
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.empty());
    
    }
}
