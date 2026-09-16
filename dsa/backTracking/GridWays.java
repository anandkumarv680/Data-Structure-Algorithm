package dsa.backTracking;

public class GridWays {
    public static int gridWays(int i, int j, int n, int m){
        if(i == n - 1 || j == m - 1){
            return 1;
        }
        if(i == n || j == m){
            return 0;
        }
        return gridWays(i + 1, j , n , m) + gridWays(i , j + 1 , n , m);
    }
    static void main(String[] args) {
        int n = 2, m = 2;
        System.out.println(gridWays(0,0,n,m));
    }
}

// another way to solve this code is
// (n + m - 2) fact divide by (n - 1)fact * (m - 1)fact
// this is linear time answer.
// O(n + m).
