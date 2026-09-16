package dsa.array;

public class ReverseWordInString {
    public static String reverseWords(String s) {
        String [] str = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();

        for(int i=str.length-1;i>=0;i--){
            sb.append(str[i]);
            if(i>0){
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = " Hello Bhai log kya haal    hai sb ka     ";
        System.out.println(reverseWords(str));
    }
}
