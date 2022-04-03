package 栈与队列;

import java.util.Stack;

public class 逆波兰表达式求值150 {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s:tokens){
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                int firstNum = stack.pop();
                int secondNum = stack.pop();
                stack.push(oprate(secondNum,firstNum,s));
            }else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
    private static int oprate(int x,int y,String op){
        switch (op) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            default:
                return x / y;
        }
    }

    public static void main(String[] args) {
        System.out.println(oprate(1,2,"-"));
    }
}
