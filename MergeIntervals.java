import java.util.*;
public class MergeIntervals {
    public static void main(String[] args) {
        ArrayList<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(15, 18));
        intervals = mergeIntervals(intervals);
        for (int i = 0; i < intervals.size(); i++) {
            System.out.println(intervals.get(i).start + " " + intervals.get(i).end);
        }
    }

    public static ArrayList<Interval> mergeIntervals(ArrayList<Interval> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            Interval curr = list.get(i);
            Interval next = list.get(i + 1);
            if (curr.end > next.start) {
                curr.end = next.end;
                list.remove(next);
                i--;
            }
        }
        return list;
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
