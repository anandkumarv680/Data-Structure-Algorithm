package dsa.heap;

import java.util.PriorityQueue;

public class SlidingWindowMaximum {
    public static class Pair implements Comparable<Pair>{
        int val;

        public Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        int idx;

        @Override
        public int compareTo(Pair p2){
            return p2.val - this.val; // for descending order p2 - this for acending this - p2
        }

    }
    static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3; // window size

        int res[] = new int[nums.length - k + 1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i = 0; i < k; i++){
            pq.add( new Pair(nums[i],i ));
        }
        res[0] = pq.peek().val;

        for(int i = k; i < nums.length; i++){
            while(pq.size() > 1 && pq.peek().idx <= (i - k)){
                pq.remove();
            }
            pq.add(new Pair(nums[i],i ));
            res[i - k + 1] = pq.peek().val;
        }

        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}
