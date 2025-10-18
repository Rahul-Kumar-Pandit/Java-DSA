package Stack;
import java.util.Stack;
public class ValidParentheses {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            // Opening Bracket
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }else{
                // First time my stack is empty 
                if(s.isEmpty()){
                    return false;
                }

                // valid closing Bracket
                if((s.peek() == '(' && ch == ')') ||
                   (s.peek() == '{' && ch == '}') ||
                   (s.peek() == '[' && ch == ']')){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "(([{[]}]()))(";
        System.out.println(isValid(str));
    }
}
