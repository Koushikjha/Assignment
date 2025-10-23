package StackI;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {

    }
    public boolean isValid(String s) {
        Stack<Character > stack=new Stack<>();
        for( char c:s.toCharArray()){
            if(!stack.isEmpty() && ((stack.peek()=='('&&c==')') || (stack.peek()=='['&&c==']') || (stack.peek()=='{'&&c=='}'))){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
