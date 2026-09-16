package dsa.hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Iteration {
    static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(5);
        hs.add(4);
        hs.add(2); // hashSet sirf unique element store krta hai unki frequency store nhi krta nd null value bhi store krta hai
        hs.add(4);
        hs.add(2);

        Iterator it =  hs.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        // advance loop

        for(Integer num : hs){
            System.out.println(num);
        }
    }
}
