package Stack;
import java.util.Stack;
public class DuplicateParentheses {
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            // Closing 
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;    // duplicates exist
                }else{
                    s.pop();        // ( (pop opening pair)
                }
            }

            // Opening 
            else{
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b))";     // true (it has duplicate)

        String str2 = "(a+(b))";    // false (it has no duplicate)

        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }
}
