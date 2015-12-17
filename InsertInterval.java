import java.util.*;
public class InsertInterval {
    public static void main(String[] args) {
        ArrayList<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 2));
        intervals.add(new Interval(3, 5));
        intervals.add(new Interval(6, 7));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(12, 16));
        intervals = insertInterval(intervals, new Interval(4, 9));
        for (int i = 0; i < intervals.size(); i++) {
            System.out.println(intervals.get(i).start + " " + intervals.get(i).end);
        }
    }

    public static ArrayList<Interval> insertInterval(ArrayList<Interval> list, Interval interval) {
        ArrayList<Interval> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Interval current = list.get(i);
            if (current.end < interval.start) {
                newList.add(current);
            } else if (interval.start >= current.start && interval.start <= current.end) {
                Interval inter = new Interval(Math.min(interval.start, current.start), Math.max(interval.end, current.end));
                newList.add(inter);
                interval = current;
            } else if (current.start >= interval.start && current.start <= interval.end) {
                Interval inter = new Interval(Math.min(interval.start, current.start), Math.max(interval.end, current.end));
                newList.add(inter);
                interval = current;
            }
        }
        return newList;
    }

    public static class Interval {
        int start;
        int end;
        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
