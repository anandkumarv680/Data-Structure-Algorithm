package dsa.hashing;

import java.util.HashSet;

public class UnionAndIntersection {
    static void main(String[] args) {
        int num1[] = { 3,7,9};
        int num2[] = {1,3,6,5,8,9};

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < num1.length; i++){
            set.add(num1[i]);
        }
        for(int i = 0; i < num2.length; i++){
            set.add(num2[i]);
        }

        System.out.println("Union : " + set.size());

        set.clear();

        int count = 0;
        for(int i = 0; i < num1.length; i++){
            set.add(num1[i]);
        }
        for(int i = 0; i < num2.length; i++){
            if(set.contains(num2[i])){
                count++;
                set.remove(num2[i]);
            }
        }

        System.out.println("InterSection : " + count);
    }
}
