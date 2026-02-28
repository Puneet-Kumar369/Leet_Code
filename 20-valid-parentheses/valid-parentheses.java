import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else if(stack.isEmpty()||!isMatchingPair(stack.pop(),c)){return false;}
        }
        return stack.isEmpty();
    }
    public boolean isMatchingPair(char ob,char cb){
        return ((ob=='(' && cb==')')||(ob=='{' && cb=='}')||(ob=='[' && cb==']'));
    }
}