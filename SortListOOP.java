import java.util.*;
public class SortListOOP {
// The coding question was basically one main and 2 classes.
// It implemented an add method. Without altering the main method,
// make it so the numbers added in order.

    public static void main(String[] args) {
        SortedList<Node> list = new SortedList<Node>();
        list.add(new Node(5));
        list.add(new Node(1));
        list.add(new Node(2));
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            Node temp = (Node)iter.next();
            System.out.println(temp.getData());
        }
    }
}

// Things to review:
// Software Testing, OOP Principles, Basic algorithms

// To use collections sort method, pass in a comparator and override the compare(E, E) method
// To implement Comparable, override compareTo

// Test cases for sorting:
// Reverse order array, in order array, no elements in array, 1 element in array,
// duplicate elements

// Encapsulation - Hiding data from other classes. Using mutators and accessors to manipulate
// private variables.
// Abstraction - Creating parent child classes
// Inheritance - Inheriting public and protected variables and methods from super class
// Polymorphism - Overloading and Overriding methods

// Divide and conquer paradigms
// Memoization
