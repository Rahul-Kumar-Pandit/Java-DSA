package Stack;
import java.util.Stack;
public class ReverseString {
    public static String reveseString(String str) {
        Stack<Character> s = new Stack<>();
        int index = 0;
        while (index < str.length()) {
            s.push(str.charAt(index));
            index++;
        }

        StringBuilder result = new StringBuilder(" ");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        String result = reveseString(str);
        System.out.println(str);
        System.out.println(result);
    }
}
