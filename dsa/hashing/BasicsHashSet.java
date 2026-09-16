package dsa.hashing;

import java.util.HashSet;

public class BasicsHashSet {
    static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(5);
        hs.add(4);
        hs.add(2); // hashSet sirf unique element store krta hai unki frequency store nhi krta nd null value bhi store krta hai
        hs.add(4); // order maintain nhi rakhta hai
        hs.add(2);
        System.out.println(hs);

        System.out.println(hs.size());
        hs.remove(4);
        System.out.println(hs);

        System.out.println(hs.size());
        hs.clear();

        System.out.println(hs.isEmpty());
        System.out.println(hs.size());

    }

}
