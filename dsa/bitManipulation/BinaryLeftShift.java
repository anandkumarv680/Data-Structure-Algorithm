package dsa.bitManipulation;

public class BinaryLeftShift {
    static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = a << b;
        int d = a >> b;
        System.out.println(c);
        System.out.println(d);

    }

 // left shift << left main chota   // a << b = a * 2 ^ b;   esme hum bits ko left side move krte hai b times or jo most left bits hoti hai wo hatt jati hai
    // right shift >> right main chota  a >> b = a / 2 ^ b;
}
