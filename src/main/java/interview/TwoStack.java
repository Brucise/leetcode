package interview;



import java.util.Stack;

/**
 * @author: chenhuang
 * @date: 2019/3/19
 * @description:
 */
public class TwoStack {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
       stack1.push(node);
    }

    public int pop() {

      while (!stack1.isEmpty()){
          stack2.push(stack1.pop());
      }
      int n = stack2.pop();
      while (!stack2.isEmpty()){
          stack1.push(stack2.pop());
      }
      return n;
    }

    public static void main(String[] args) {
        TwoStack twoStack = new TwoStack();
        twoStack.push(1);
        twoStack.push(2);
        System.out.println(twoStack.pop());
    }
}
