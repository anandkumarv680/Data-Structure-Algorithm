package dsa.bitManipulation;

public class Odd_Even {
    public static void oddOrEven(int n){

        if((n & 1) == 1){
            System.out.println("odd");
        }
        else{
            System.out.println("Even");
        }
    }
    static void main(String[] args) {
        oddOrEven(4);
        oddOrEven(6);
        oddOrEven(7);
    }
}
