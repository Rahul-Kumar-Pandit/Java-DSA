/* public class Backtracking {
    public static void changeArray(int arr[],int i,int val){
        if(i==arr.length){
            System.out.println("Before Recursion : ");
            printArray(arr);
            return;
        }
        arr[i] = val;
        changeArray(arr, i+1, val+1);
        arr[i] = arr[i] - 2;
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArray(arr, 0, 1);
        System.out.println("After Recursion : ");
        printArray(arr);
    }
}
*/


/* 
    Question :- 
    Find and print all subsets of a given string "abc";
 */
/* 
public class Backtracking {
    public static void findSubset(String str,String ans,int i){
        // Base Case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        // yes choice 
        findSubset(str, ans+str.charAt(i), i+1);

        // No choice 
        findSubset(str, ans, i+1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubset(str, "", 0);
    }
}
 */

/* 
  Find and print all the permutation of a String "abc";
 */
public class Backtracking {
    public static void findPermutations(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            // Remove currChar 
            // ex :- remove "c";
            // "abcde" => "ab"+"de" => "abde"
            String newStr = str.substring(0, i) + str.substring(i+1);
            findPermutations(newStr, ans+currChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }
}