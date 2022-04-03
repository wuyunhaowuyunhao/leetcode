package 字符串;
/**
 * https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 */
public class 左旋转字符串 {
    public static String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=n;i<s.length();i++){
            sb.append(s.charAt(i));
        }
        for(int i=0;i<n;i++){
            sb.append(s.charAt(i));
        }
        return new String(sb);
    }

    public static void main(String[] args) {

    }
}
