package 栈与队列;

import java.util.Stack;

public class 删除字符串中的所有相邻重复项1047 {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(stack.empty()){
                stack.push(s.charAt(i));
            }else {
                if(stack.peek()==s.charAt(i)){
                    stack.pop();
                }else {
                    stack.push(s.charAt(i));
                }
            }
        }
        while (!stack.empty()){
            sb.append(stack.pop());
        }
        return new String(sb.reverse());
    }
}
