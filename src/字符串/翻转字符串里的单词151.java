package 字符串;

import java.util.Arrays;

public class 翻转字符串里的单词151 {
    public static String reverseWords(String s) {
        s = s.trim();

        StringBuilder sb = new StringBuilder();
        boolean firstBlank = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                firstBlank = true;
                sb.append(s.charAt(i));
            } else {
                if (firstBlank) {
                    sb.append(s.charAt(i));
                    firstBlank = false;
                }
            }
        }
        String[] words = new String(sb).split(" ");

        StringBuilder res = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            res.append(words[i]);
            res.append(' ');
        }
        res.delete(res.length()-1,res.length());//删掉多余空格

        return new String(res);
    }

    public static void main(String[] args) {
        String s = "   a good   example   ";

        System.out.println(reverseWords(s));
    }
}
