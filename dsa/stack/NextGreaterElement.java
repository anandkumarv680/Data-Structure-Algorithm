package dsa.stack;

import java.util.Stack;

public class NextGreaterElement {

    public static void nextGreater(int arr[], int result[]){
        Stack<Integer> s = new Stack<>();

        for(int i = arr.length - 1; i >= 0; i--){
            while(!s.isEmpty() && arr[i] >= arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                result[i] = -1;
            }else{
                result[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }
    static void main(String[] args) {
        int arr[] = {6,8,0,1,3,4,0};
        int result[] = new int[arr.length];

        nextGreater(arr, result);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
