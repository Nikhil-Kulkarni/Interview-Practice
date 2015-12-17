// How would you design a stack which, in addition to push and pop, also has
// a function min which return the minimum element? Push, pop and min
// shoudld all operate in O(1) time

public class StackWithMin extends Stack<Integer> {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();
    public void push(int a) {
        if (!minStack.isEmpty()) {
            minStack.push(a);
        }
        if (a < minStack.peek()) {
            minStack.push(a);
        }
        stack.push(a);
    }

    public int min() {
        return minStack.peek();
    }

    public int pop() {
        if (minStack.peek() == stack.peek()) {
            minStack.pop();
        }
        return stack.pop();
    }
}
