/* public class Recursion1 {

    // Print number in reverse order

    public static void printReverse(int num){
        if(num<1){
            return;
        }
        System.out.print(num+" ");
        printReverse(num-1);
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println();
        printReverse(num);
    }
}
 */
// Question 2.
// Prints Numbers in Increasing Order 
/* public class Recursion1 {
    public static void printInc(int num){
        if(num==1){
            System.out.print(num+" ");
            return;
        }
        printInc(num-1);
        System.out.print(num+" ");
    }

    public static void main(String[] args) {
        int num = 5;
        printInc(num);
    }
}
 */

//  Question 3.
//  Sum of N natural numbers
/* public class Recursion1 {
    public static int calculateSum(int num){
        if(num==1){
            return 1;
        }
        return num+calculateSum(num-1);
    }

    public static void main(String[] args) {
        System.out.println(calculateSum(5));
    }
}
 */

// Question 4.
// Find the fibonacci Series
/* public class Recursion1 {
    public static void Fibonacci(int a,int b,int num){
        if(num<=2){
            return;
        }
        int c = a+b;
        System.out.print(c+" ");
        Fibonacci(b, c, num-1);
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        // int num = 5;
        System.out.print(a+" "+b+" ");
        Fibonacci(a, b, 8);
    }
}
 */
// Question 5.
// Check if a given array is sorted or not
/* public class Recursion1 {
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(isSorted(arr, 0));
    }
}
 */

// Question 6.
// find the first occurance of element in array
/* public class Recursion1 {
    public static int firstOccurance(int arr[],int i){
        int key = 5;
        if(arr[i] == arr.length-1){
            return -1; 
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurance(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3,7,6,5,9,10};
        System.out.println(firstOccurance(arr, 0));
    }
}
 */
// Question 7.
// Find the last occurance of element in arrry
/* public class Recursion1 {
    public static int lastOccurance(int arr[],int key,int i){
        if(arr[i]==arr.length-1){
            return -1;
        }
        int isFound = lastOccurance(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3,7,6,5,9,10};
        System.out.println(lastOccurance(arr,5, 0));
    }
} */


// Question 8.
// Find the value of (X^n)

/* public class Recursion1 {
    public static int calcPow(int x,int n){
        if(n==0){
            return 1;
        }
        return x*calcPow(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(calcPow(3, 4));
    }
    
} */

// Calculate power in optimized way
/* public class Recursion1 {
    public static int optimizedPower(int a, int n){
        if(n==0){
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;
        // if n is odd
        if(n%2!=0){
            return a*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int a=2;
        int n=10;
        System.out.println(optimizedPower(a, n));
    }
} */


// Question 9.
//  Tiling Problem 
/* public class Recursion1 {
    public static int tilingProblem(int n){
        // Base case 
        if(n==0 || n==1){
            return 1;
        }
        // Vertical ways
        int fnm1 = tilingProblem(n-1);

        // Horizontal ways
        int fnm2 = tilingProblem(n-2);
        int totalways = fnm1 + fnm2;
        return totalways;

       // return  tillingProblem(n-1) + tillingProblem(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(tilingProblem(n));
    }
} */

// Question 10.
// Remove Duplicates from the string

/* public class Recursion1 {
    public static void removeDuplicate(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            // Duplicates exist
            removeDuplicate(str, idx+1, newStr, map);
        }else{
            map[currChar-'a']=true;
            removeDuplicate(str, idx+1, newStr.append(currChar), map);
        }
        // System.out.println(idx+" "+"HII");
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println("Hii");
    }
} */

// Question 11.
// Friends Pairing problem

/* 
public class Recursion1 {
    
    public static int friendsPairing(int n){
        if(n==1||n==2){
            return n;
        }
        // // Choice
        // // Single
        // int fnm1 = friendsPairing(n-1);

        // // Pair
        // int fnm2 = friendsPairing(n-2);
        // int Pairs = (n-1)*fnm2;
        // int totalways = fnm1 + Pairs;
        // return totalways;

        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }

    public static void main(String[] args) {
        System.out.println(friendsPairing(4));
        // System.out.println(tilingProblem(4));
    }
}
 */

public class Recursion1 {
    public static void printBinaryString(int n,int lastPlace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinaryString(n-1, 0, str+("0"));
        if(lastPlace==0){
            printBinaryString(n-1, 1, str+("1"));
        }
    }
    public static void main(String[] args) {
        int n=3;
        printBinaryString(n, 0, "");
    }
}