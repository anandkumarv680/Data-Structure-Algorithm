package dsa.recursion;

import java.util.Scanner;

import java.util.Scanner;

public class RemoveDuplicate2 {

    public static void removeDuplicates(StringBuilder sb, String str, int idx, boolean[] map) {

        if (idx == str.length()) {
            System.out.println(sb);
            return;
        }

        char currCh = str.charAt(idx);

        if (map[currCh - 'a'] == true) {
            removeDuplicates(sb, str, idx + 1, map);
        } else {
            map[currCh - 'a'] = true;
            sb.append(currCh);

            removeDuplicates(sb, str, idx + 1, map);
        }
    }

    public static void main(String[] args) {

        boolean[] map = new boolean[26];

        System.out.println("Enter a string");

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder sb = new StringBuilder();

        removeDuplicates(sb, str, 0, map);
    }
}
