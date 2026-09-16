package dsa.hashing;

import java.util.HashMap;
import java.util.Set;

public class MajorityElement {
    static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 1, 3, 1, 5, 1};

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i]) + 1 );
            }
            else{
                hm.put(arr[i],1 );
            }
            // shortcut method
            // =>     hm.put(arr[i], hm.getOrDefault(arr[i],0) + 1 );   ye wala ek line main hi kr dega
        }

        Set<Integer> keys = hm.keySet();
        for(Integer key : keys){
            if(hm.get(key) > arr.length/3){
                System.out.println(key);
            }
        }
        // shortcut in for loop
        // = > for(Integer key : hm.keySet())  ese bhi kr skte hai
    }
}
