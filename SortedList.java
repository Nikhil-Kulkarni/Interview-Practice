import java.util.*;
public class SortedList<E> extends ArrayList<E> implements Iterable<E> {
    @Override
    public boolean add(E num) {
        Node curr = (Node)num;
        // int i;
        // for (i = 0; i < size(); i++) {
        //     Node temp = (Node)get(i);
        //     if (curr.compareTo(temp) <= 0) {
        //         super.add(i, num);
        //         return true;
        //     }
        // }
        super.add(num);
        return true;
    }

    public Iterator<E> iterator() {
        return new SortedListIterator<E>(this);
    }

    private class SortedListIterator<E> implements Iterator<E> {
        SortedList<E> list;
        int i = -1;
        public SortedListIterator(SortedList<E> list) {
            Collections.sort(list, new Comparator<E>() {
                @Override
                public int compare(E node, E node2) {
                    return ((Node)node).getData() - ((Node)node2).getData();
                }
            });
            this.list = list;
        }

        public boolean hasNext() {
            boolean temp = i < list.size() - 1;
            i++;
            return temp;
        }

        public E next() {
            return list.get(i);
        }
    }
}
