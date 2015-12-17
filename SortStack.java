// Write a program to sort a stack in ascending order
// You may use at most one additional stack to hold items, but you
// may not copy the elements into any other data structure

public Stack<Integer> SortStack(Stack<Integer stack) {
    Stack<Integer> newStack = new Stack<Integer>();
    while (!stack.isEmpty()) {
        int temp = stack.pop();
        if (newStack.isEmpty() || temp >= newStack.peek()) {
            newStack.push(temp);
        }
        else {
            while (temp < newStack.peek() && !(newStack.isEmpty())) {
                stack.push(newStack.pop());
            }
            newStack.push(temp);
        }
    }
    return newStack;
}
