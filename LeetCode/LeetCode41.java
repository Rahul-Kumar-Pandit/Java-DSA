/* package LeetCode;

public class LeetCode41 {
    public static int firstPositive(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            while(arr[i]>0 && arr[i]<=n && arr[arr[i]-1] != arr[i]){
                swap(arr,i,arr[i]-1);
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0; i<n; i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return n+1;

    }
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        // int arr[] = {3,4,-1,1};
        // int result = firstPositive(arr);
        // System.out.println(result);

        System.out.println("Hii Rahul Welcome to IntelliJ IDEA");
    }
}
 */

package LeetCode;
import java.util.*;
public class LeetCode41 {
    public static int longestValidParentheses(String s) {
        Stack<Character> stk = new Stack<>();
        int result = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='('){
                stk.push(ch);
            }
            if(stk.peek() == '(' && ch == ')'){
                result++;
                stk.pop();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = ")()()";
        System.out.println(longestValidParentheses(s));
    }
    
}
