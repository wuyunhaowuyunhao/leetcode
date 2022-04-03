package 栈与队列;

import java.util.Stack;

public class 有效的括号20 {
    private static boolean match(char a, char b) {
        if (a == '(')
            return b == ')';
        if (a == '[')
            return b == ']';
        if (a == '{')
            return b == '}';
        return false;
    }

    public static boolean isValid(String s) {

        if (s.length() % 2 != 0 || s.length() == 0)
            return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {//左括号压入栈
                //System.out.println("pushed");
                stack.push(s.charAt(i));
            } else {//右括号消去栈顶匹配的括号
                if (stack.empty())
                    return false;
                if (match(stack.peek(),s.charAt(i))) {
                    stack.pop();
                    //System.out.println("poped");
                } else
                    return false;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }
}
