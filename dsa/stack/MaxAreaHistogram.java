package dsa.stack;

import java.util.Stack;

public class MaxAreaHistogram {
    public static void MaxArea(int arr[]){
        int maxArea = 0;
        // next smaller right
        int nsr[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--){
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // next smaller left
        int nsl[] = new int[arr.length];
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++){
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        // max area
        for(int i = 0; i < arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height*width;
            maxArea = Math.max(currArea,maxArea);
        }
        System.out.println("Max Area in Histogram is : " + maxArea);
    }
    static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        MaxArea(arr);
    }
}
