package array.mergeintervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
 * and return an array of the non-overlapping intervals that cover all the intervals in the input.
 *
 *
 *
 * Example 1:
 *
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 * Example 2:
 *
 * Input: intervals = [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 * 
 */
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

        List<int[]> result = new ArrayList<>();
        int[] interval = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (interval[1] >= intervals[i][0]) {
                interval[1] = Math.max(interval[1], intervals[i][1]);
            } else {
                result.add(interval);
                interval = intervals[i];
            }
        }

        result.add(interval);

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
//        int[][] arr={{1,4},{5,6}};
        int[][] arr={{1,3},{2,6},{8,10},{15,18}};
        new MergeIntervals().merge(arr);
    }
}
