package dsa.hashing;

import java.util.HashMap;

public class LargestSubarraySumZero {
    static void main(String[] args) {
        int nums[] = {15, 2, -2, 1, 7, -8, 10, -11};
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0, len = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum)){
                len = Math.max(len, i - map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }

        System.out.println("Max subarray length is : " + len + " whose sum as zero");
    }
}
