package 字符串;

public class 替换空格 {
    public static String replaceSpace(String s) {
        String[] strs = s.split(" ");
        return s.replaceAll(" ","%20");
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }
}
