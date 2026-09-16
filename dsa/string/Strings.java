package dsa.string;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = { 'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");
        // strings are immutable.

        // input
        String name;
        String fullName;
//        name = sc.next();                             // only for single word or before 1st space
//        System.out.println("hello i am " + name);
        fullName = sc.nextLine();                        // for complete line
        System.out.println("hello i am " + fullName);

        System.out.println(fullName.length());  // .length() use parenthesis must in string

        // charAt use krke hum pta krte hai character at idx.
        System.out.println(fullName.charAt(3));

        // string compare krne k liye jyada sahi hai
        // stringname.equals();  parenthesis k ander dusri stringname;

        String s1 = "hi";
        String s2 = new String("hi");

        System.out.println(s1 == s2);
        if (s1.equals(s2)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        sc.close();
    }
}
