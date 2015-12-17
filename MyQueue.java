// Implement a MyQueue class which implements a queue using two stacks

public class MyQueue {
    Stack<Integer> newStack;
    Stack<Integer> oldStack;

    public MyQueue() {
        newStack = new Stack<Integer>();
        oldStack = new Stack<Integer>();
    }

    public void enqueue(int a) {
        newStack.push(a);
    }

    public int dequeue() {
        if (oldStack.isEmpty()) {
            while (!newStack.isEmpty()) {
                oldStack.push(newStack.pop());
            }
        }
        return oldStack.pop();
    }
}
