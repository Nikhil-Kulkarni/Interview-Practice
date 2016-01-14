import java.util.*;
public class SortListOOP {
// The coding question was basically one main and 2 classes.
// It implemented an add method. Without altering the main method,
// make it so the numbers added in order.

    public static void main(String[] args) {
        SortedList<Node> list = new SortedList<Node>();
        list.add(new Node(2));
        list.add(new Node(1));
        list.add(new Node(5));
        for (Node num : list) {
            System.out.println(num.getData());
        }
    }
}

// Encapsulation - Hiding data from other classes. Using mutators and accessors to manipulate
// private variables.
//
