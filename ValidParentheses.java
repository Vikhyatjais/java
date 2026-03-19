import java.util.*;
public class ValidParentheses {
    public static void main(String[] args) {
        String s = "(()";
        System.out.println(isValid(s));   
    }
    public static boolean isValid(String s){
        Stack <Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(c);
            }
            else if(c==')'){
                if(st.isEmpty()){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
