package dsa.hashing;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class BasicsLinkedHashSet {
    static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(5);
        lhs.add(4);
        lhs.add(2); // LinkedhashSet sirf unique element store krta hai unki frequency store nhi krta nd null value bhi store krta hai
        lhs.add(4); // order maintain rakhta hai
        lhs.add(2);
        System.out.println(lhs);

        System.out.println(lhs.size());
        lhs.remove(4);
        System.out.println(lhs);

        System.out.println(lhs.size());
        lhs.clear();

        System.out.println(lhs.isEmpty());
        System.out.println(lhs.size());
    }
}
