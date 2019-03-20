package interview;

import java.util.Stack;

/**
 * @author: chenhuang
 * @date: 2019/3/19
 * @description:
 */
public class MinStack {

    Stack<Integer> stack = new Stack();
    Stack<Integer> min = new Stack();

    public void push(int node) {
        stack.push(node);
        if(min.isEmpty() || node <= min.peek())
            min.push(node);
        else
            min.push(min.peek());
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min.peek();
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
//        stack.push(3);
//        stack.push(2);

        System.out.println(stack.min());
    }
}
