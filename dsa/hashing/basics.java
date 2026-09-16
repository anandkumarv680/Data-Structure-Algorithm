package dsa.hashing;

import java.util.HashMap;
import java.util.Set;

public class basics {
    static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        // LinkedHashMap => hamesha jis order main element put krege waie hi milega print k time pe O(1)
        // TreeMap => esme key hamesha sorted form main output milega O(logn)  red black tree se implement hoga

        // insert O(1)
        hm.put("India",100);
        hm.put("Russia",50);
        hm.put("Nepal",10);
        System.out.println(hm);

        // get- O(1)
        int population = hm.get("India");
        System.out.println(population);

        // containskey - O(1) return in boolean same as containsValue
        System.out.println(hm.containsKey("India"));

        //Iterate
        Set<String> keys = hm.keySet();   // hm.entrySet se humhe key and value pair main mil jate hai
        System.out.println(keys);

        for(String k : keys){
            System.out.println("key = " + k +", value = " + hm.get(k) );
        }

        // remove - O(1)
        System.out.println(hm.remove("Nepal"));
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        // isEmpty;
        System.out.println(hm.isEmpty());

        //clear - poore hashmap ko khaali kr deta hai
        hm.clear();
        System.out.println(hm);
    }
}
