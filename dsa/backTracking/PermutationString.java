package dsa.backTracking;

public class PermutationString {
    public  static void permutationString(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i + 1);
            permutationString(newStr,ans + ch);
        }
    }
    static void main(String[] args) {
        String str = "abc";
        permutationString(str,"");
    }
}
