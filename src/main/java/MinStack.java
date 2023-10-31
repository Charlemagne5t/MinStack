import java.util.Stack;

public class MinStack {
    private Stack<Node> stack;
    private int currentMin;

    public MinStack() {
        stack = new Stack<>();
        currentMin = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if(stack.empty()){
            currentMin = val;
        } else currentMin = Math.min(currentMin, val);

        stack.push(new Node(val, currentMin));
    }

    public void pop() {
        stack.pop();
        if(!stack.empty()) {
            currentMin = Math.max(currentMin, stack.peek().min);
        }
    }

    public int top() {

        return stack.peek().val;
    }

    public int getMin() {
        return currentMin;
    }
}
class Node{
    int val;
    int min;
    public Node(int val, int min) {
        this.val = val;
        this.min = min;
    }

}
