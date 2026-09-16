package dsa.string;

import java.util.Scanner;

public class ShortestPath {
    public static float shortestPath(String S){
        int x = 0;
        int y = 0;

        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == 'n'){
                y++;
            }
            else if(S.charAt(i) == 's'){
                y--;
            }
            else if(S.charAt(i) == 'e'){
                x++;
            }
            else{
                x--;
            }
        }
        return (float)Math.sqrt(x*x + y*y);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Direction");
        String S = sc.next();
        float result = shortestPath(S);
        System.out.println(result);
    }
}
