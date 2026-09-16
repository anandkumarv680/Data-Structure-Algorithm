package dsa.hashing;

import java.util.HashSet;

public class DistinctElement {
    static void main(String[] args) {
        int nums[] = {1,4,3,2,5,8,6,4,3,2,4,3,4,3,2,4,4,3,5,8,4,2};

        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            hs.add(nums[i]);
        }
        System.out.println("Unique element is : " + hs.size()+ " total elements are : " + nums.length);
    }
}
