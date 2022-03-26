package heap;

import java.util.*;

/**
 *
 * https://leetcode.com/problems/top-k-frequent-elements/
 *
 * 347. Top K Frequent Elements
 *
 * Given a non-empty array of integers, return the k most frequent elements.
 *
 * Example 1:
 *
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 *
 * Input: nums = [1], k = 1
 * Output: [1]
 *
 */
public class TopKFrequent {

    /*
    build a counter map that maps a num to its frequency
    build a heap/priority queue that keeps track of k most significant entries
    iterate through the final heap and get the keys
     */
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
                new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            maxHeap.add(entry);
        }

        int[] res= new int[k];


        for (int i = 0; i <k; i++) {
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            res[i]=entry.getKey();
        }

        return res;
    }

    public static void main(String[] args) {
        new TopKFrequent().topKFrequent(new int[]{1,2},2);
    }
}
