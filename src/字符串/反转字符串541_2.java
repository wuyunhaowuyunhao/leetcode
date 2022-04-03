package 字符串;

public class 反转字符串541_2 {
    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for(int i=0;i< chars.length;i+=2*k){
            int begin = i;
            int end = Math.min(chars.length-1,begin+k-1);//最多翻转k个字符,所以end就是数组长度-1与begin往后k-1的最小值
            reverseChars(chars,begin,end);
        }
        return new String(chars);
    }
    static void reverseChars(char[] chars,int begin,int end){
        char temp;
        while (begin<end){
            temp = chars[begin];
            chars[begin] = chars[end];
            chars[end] = temp;
            begin++;
            end--;
        }
    }

    public static void main(String[] args) {
        char[] chars = {'a','b','c'};
        reverseChars(chars,0,2);
        System.out.println(chars);
    }
}
