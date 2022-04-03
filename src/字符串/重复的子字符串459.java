package 字符串;

public class 重复的子字符串459 {
    public static boolean repeatedSubstringPattern(String s) {
        int subLength = 1;//子串长度
        while (subLength < s.length()) {
            if (s.length() % subLength != 0) {//不是整倍数就跳过
                subLength++;
                continue;
            }
            boolean flag=true;
            for (int i = subLength; i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(i % subLength)) {//不一样就跳过
                    flag = false;
                    break;
                }
            }
            if(flag)//没有不一样的，返回true
                return true;
            subLength++;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("aaaaab"));
    }
}
