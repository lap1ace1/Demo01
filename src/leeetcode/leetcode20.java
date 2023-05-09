package leeetcode;

import java.util.Arrays;
import java.util.Stack;

public class leetcode20 {
    public static void main(String[] args) {
        String s =  "()[]{}";
        System.out.println(isValid(s));

    }
    public static boolean isValid(String s) {
        if (s.length()==0){
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (char i :s.toCharArray()) {
            if (i=='{'||i=='('||i=='['){
                stack.push(i);
            }else {
                if (stack.isEmpty()){
                    return false;
                }else {
                    char temp = stack.pop();
                    if (i==')'){
                        if (temp!='('){
                            return false;
                        }
                        }else if (i=='}'){
                        if (temp!='{'){
                            return false;
                        }
                    }else if (i==']'){
                        if (temp!='['){
                            return false;
                        }
                    }
                }
            }
        }return stack.isEmpty()?true:false;

    }
}







