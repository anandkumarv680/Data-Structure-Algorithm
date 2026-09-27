//import java.util.ArrayList;
//import java.util.List;
//
//public class check {
//
//    int m;
//    int n;
//
//    public boolean isValid(int[][] heights, int prev, int i, int j) {
//        if (i < 0 || j < 0 || i >= m || j >= n) {
//            return false;
//        }
//
//        if (heights[i][j] > prev) {
//            return false;
//        }
//
//        if ((i == 0 || j == 0) && (i == m - 1 || j == n - 1)) {
//            return true;
//        }
//
//        int curr = heights[i][j];
//        return isValid(heights, curr, i + 1, j) ||
//                isValid(heights, curr, i - 1, j) ||
//                isValid(heights, curr, i, j + 1) ||
//                isValid(heights, curr, i, j - 1);
//
//    }
//
//    public List<List<Integer>> pacificAtlantic(int[][] heights) {
//
//        this.m = heights.length;
//        this.n = heights[0].length;
//        List<List<Integer>> result = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (isValid(heights, heights[i][j], i, j)) {
//                    temp.add(i);
//                    temp.add(j);
//                    result.add(temp);
//                    temp.clear();
//                }
//            }
//        }
//
//        return result;
//    }
//
//    public void main(String[] args) {
//        int[][] heights = {
//                {1, 2, 2, 3, 5},
//                {3, 2, 3, 4, 4},
//                {2, 4, 5, 3, 1},
//                {6, 7, 1, 4, 5},
//                {5, 1, 1, 2, 4}
//        };
//        ArrayList<ArrayList<Integer>> ans =  pacificAtlantic(heights);
//    }
//}