package 字符串;

public class 反转字符串541 {
    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        if(s.length()%(2*k)<k){//剩余少于k,全部反转
            int begin = s.length()-s.length()%(2*k);
            int end = s.length()-1;
            reverseChars(chars,begin,end);
        }else if(s.length()%(2*k)>=k){//剩余大于等于k,反转k个
            int begin = s.length()-s.length()%(2*k);
            int end = begin+k-1;
            reverseChars(chars,begin,end);
        }

        int loop = s.length()/(2*k);//长度除以2k就是需要反转的次数
        for (int i=0;i<loop;i++){
            reverseChars(chars,i*2*k,i*2*k+k-1);
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
