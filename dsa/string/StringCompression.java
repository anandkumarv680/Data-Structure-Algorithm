package dsa.string;

public class StringCompression {
    public static String charCount(String str){
        StringBuilder sb = new StringBuilder();
      // aaabb
        for(int i = 0; i < str.length(); i++){
            Integer count = 1;
            while( i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    static void main(String[] args) {
        String str = "aaaabccd";
        System.out.println(charCount(str));
    }
}
