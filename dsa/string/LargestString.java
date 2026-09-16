package dsa.string;

public class LargestString {
    static void main(String[] args) {
        String fruits[] = {"apple", "banana", "mango"};

        String largest = fruits[0];

        for(int i = 1; i < fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){    // compareTo library function jai + and - output deta hai
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
