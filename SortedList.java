import java.util.*;
public class SortedList<E> extends ArrayList<E> {
    @Override
    public boolean add(E num) {
        Node curr = (Node)num;
        int i;
        for (i = 0; i < size(); i++) {
            Node temp = (Node)get(i);
            if (curr.compareTo(temp) <= 0) {
                super.add(i, num);
                return true;
            }
        }
        super.add(num);
        return true;
    }
}
