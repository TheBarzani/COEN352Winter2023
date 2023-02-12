import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Example3 {

    public static void main(String[] args) {
        Interval i1 = new Interval(12,14);
        Interval i2 = new Interval(1,4);
        Interval i3 = new Interval(3,5);
        Interval i4 = new Interval(7,9);
        Interval i5 = new Interval(8,11);
        Interval i6 = new Interval(6,8);

        List<Interval> list = new ArrayList<>();
        list.add(i1);
        list.add(i2);
        list.add(i3);
        list.add(i4);
        list.add(i5);
        list.add(i6);

        List<Interval> answer = Solution2.merge(list);
        for (Interval i:answer) {
            System.out.print("("+i.start+","+i.end+")"+ ", ");
        }

    }
}

class Interval{
    int start;
    int end;

    public Interval(int start,int end){
        this.start = start;
        this.end = end;
    }

}
class Solution2 {
    public static List<Interval> merge(List<Interval> intervals) {
        LinkedList<Interval> merged = new LinkedList<>();
        if (intervals == null || intervals.size() == 0) {
            return merged;
        }

        // Sort by ascending starting point using Collections.sort()
        Collections.sort(intervals, (a, b) -> a.start - b.start);
        for (Interval interval : intervals) {
            // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.

            if (merged.isEmpty() || merged.getLast().end < interval.start) {
                merged.add(interval);
                // otherwise, there is overlap, so we merge the current and previous intervals.
            } else {
                merged.getLast().end = Math.max(merged.getLast().end, interval.end);
            }
        }

        return merged;
    }
}
