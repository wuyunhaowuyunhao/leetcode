package 字符串;

public class 实现strStr28 {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;
        int[] next = new int[needle.length()];
        getNext(next, needle);

        int i = 0;
        int j = 0;
        for (; i < haystack.length(); i++) {
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)){
                j = next[j-1];
            }
            if(haystack.charAt(i)==needle.charAt(j)){
                j++;
            }
            if (j==needle.length()){
                return i-needle.length()+1;
            }
        }
        return -1;

    }

    void getNext(int[] next, String s) {
        int j = 0;//前缀的末尾
        int i = 1;//后缀的末尾
        next[0] = 0;//第一个字符没有前缀后缀
        for (; i < s.length(); i++) {
            while (s.charAt(i) != s.charAt(j) && j > 0) {
                j = next[j - 1];//不相等则j回退，直到相等或退到头
            }
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
    }
}
