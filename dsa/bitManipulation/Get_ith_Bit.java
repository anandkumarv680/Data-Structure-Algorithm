package dsa.bitManipulation;

public class Get_ith_Bit {
    public static void ith_Bit(int n, int i){
        if((n & (1 << i)) == 0){
            System.out.println("ith bit is " + 0);
        }
        else{
            System.out.println("ith bit is " + 1);
        }
    }
    static void main(String[] args) {
        ith_Bit(3,1);
        ith_Bit(4,1);
    }
}
