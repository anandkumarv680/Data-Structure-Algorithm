package dsa.string;

public class SubString {
    public static String subString( String S, int si, int ei  ){
        String subStr = "";
        for(int i = si; i < ei ; i++){
            subStr += S.charAt(i);
        }
        return subStr;
    }
    static void main(String[] args) {
        String S = "HelloWorld";
        String result = subString(S, 2,5);
        System.out.println(result);

    }
    // library function .substring(si,ei);  s of string is small.
}
