package dsa.string;

public class StringBuilderDemo {
    static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        for(char ch = 'a'; ch < 'z'; ch++ ){
            sb.append(ch);  // add krega end main
        }
        System.out.println(sb);
        System.out.println(sb.length());  // .length() total length btayega strigbuilder ki
    }
}
