package dsa.recursion;

import java.util.Scanner;

public class RemoveDuplicate1 {
    public static String removeDuplicates(StringBuilder sb,String str, int idx){
        if(idx == str.length()){
            return sb.toString();
        }

        if(sb.indexOf(String.valueOf(str.charAt(idx))) == -1){
            sb.append(str.charAt(idx));
        }
         return removeDuplicates(sb,str, idx + 1);

    }
    static void main(String[] args) {
        String str;
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        StringBuilder sb = new StringBuilder();
        System.out.println(removeDuplicates(sb,str,0));;
    }
}


/*
1. charAt(index) string and string builder k liye
   - Kisi String ke given index se character nikalta hai.
   - Example: "abc".charAt(1)
   - Result: 'b'


2. String.valueOf()
   - Kisi value ko String me convert karta hai.
   - Example: String.valueOf('b')
   - Result: "b"


3. indexOf() for string and string builder
   - Check karta hai ki given String kis index par present hai.
   - Agar value mil jati hai to uska index return karta hai.
   - Agar value nahi milti to -1 return karta hai.
   - Example: sb.indexOf("b")

   Important:
   indexOf("b") == -1  --> "b" present nahi hai.
   indexOf("b") != -1  --> "b" present hai.


4. contains()  only for string
   - Check karta hai ki given String present hai ya nahi.
   - Present hone par true return karta hai.
   - Present nahi hone par false return karta hai.
   - Example: "abc".contains("b")
   - Result: true


Quick Revision:

charAt(index)     --> Character nikalta hai.
String.valueOf()  --> Value ko String me convert karta hai.
indexOf()         --> Position/index find karta hai. Nahi mila to -1.
contains()        --> Present hai ya nahi check karta hai. true/false return karta hai.
*/