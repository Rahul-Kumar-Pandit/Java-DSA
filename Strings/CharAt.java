package Strings;

/* public class CharAt {
    public static void printLatters(String str){
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String str = "Tony";
        // Calculate length
        System.out.println(str.length());

        System.out.println(str.charAt(0));
        printLatters(str);
    }
}
 */

// Question 1.
// Check if a string is palindrome 
/* public class CharAt{
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
} 
*/

// Question 2.
// Given a route containing 4 direction(N,E,W,S);
// Find the sortest path to reach direction
/* public class CharAt{
    public static float getSortestPath(String path){
        int x=0,y=0;
        for(int i=0; i<path.length(); i++){
            char direction = path.charAt(i);
            if(direction=='E'){
                x++;
            }else if(direction=='W'){
                x--;
            }else if(direction=='N'){
                y++;
            }else if(direction=='S'){
                y--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float) Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNNM";
        System.out.println(getSortestPath(str));
    }
}
 */

// Question 3.
// for a given set of strings print the largest string 
/* public class CharAt{
    public static void main(String[] args) {
        String fruit[] = {"apple","mango","banana"};
        String largest = fruit[0];
        for(int i=0; i<fruit.length; i++){
            if(largest.compareTo(fruit[i])<0){
                largest = fruit[i];
            }
        }
        System.out.println(largest);
    }
}
 */

// Question 4
// for a given string convert each the first latter of
// each word to upperCase
public class CharAt{
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==' '&&i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am rahul";
        System.out.println(toUpperCase(str));
    }
}