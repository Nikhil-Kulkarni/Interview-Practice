import java.util.*;
public class Node implements Comparable<Node> {
    public int data;
    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    @Override
    public int compareTo(Node node) {
        return this.data - node.getData();
    }

}
