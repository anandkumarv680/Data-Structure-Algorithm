package dsa.backTracking;

public class SubString {
    public static void subString(String str, String ans, int idx){

        if(idx == str.length() ){
            if(ans.length() == 0){
                System.out.print("null");
            }
            else{
                System.out.print(ans + " ");
            }
            return;
        }
        // for yes
        subString(str, ans + str.charAt(idx), idx + 1);
        // for no
        subString(str, ans , idx + 1);
    }
    static void main(String[] args) {
        String str = "abc";
        subString(str, "", 0);
    }
}


// split function se hum sbko split kr skte hai .split("\\s");
// mtlb \t ya \n k liye
