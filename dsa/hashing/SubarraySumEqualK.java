package dsa.hashing;

import java.util.HashMap;

public class SubarraySumEqualK {
    static void main(String[] args) {
        int nums[] = {10, 2, -2, -20, 10};
        int k = -10;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int sum = 0, count = 0;
        for(int j = 0; j < nums.length; j++){
            sum+= nums[j];
            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }
            map.put(sum,map.getOrDefault(sum, 0) + 1);
        }

        System.out.println("total subArray is : " + count);
    }
}
