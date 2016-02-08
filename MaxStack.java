public class MaxStack<T> {
    Stack<T> stack = new Stack<>();
    Stack<T> maxStack = new Stack<>();
    public void push(T obj) {
        if (maxStack.isEmpty() || maxStack.peek() < obj) {
            maxStack.push(obj);
        }
        stack.push(obj);
    }

    public T pop() {
        if (stack.peek() == maxStack.peek()) {
            maxStack.pop();
        }
        return stack.pop();
    }

    public T popMax() {
        if (maxStack.isEmpty()) {
            return NULL;
        }
        return maxStack.pop();
    }
}
