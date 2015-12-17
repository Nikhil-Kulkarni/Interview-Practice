// Implement a data structure SetOfStacks that creates a new stack
// when a threshold has been reached

public class SetOfStacks {
    private ArrayList<Stack<Integer>> set = new ArrayList<Stack<Integer>>();
    private int capacity = 10;

    public SetOfStacks(int capacity) {
        this.capacity = capacity;
    }

    public void push(int a) {
        if (set.isEmpty()) {
            set.add(new Stack<Integer>());
        }
        if (set.get(set.size() - 1).size == CAPACITY) {
            set.add(new Stack<Integer>);
        }
        set.get(set.size() - 1).push(a);
    }

    public int pop(int a) {
        if (set.isEmpty()) {
            return -1;
        }
        if (set.get(set.size() - 1).size == 0) {
            set.remove(set.size() - 1);
        }
        set.get(set.size() - 1).pop();
    }
}
