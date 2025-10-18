package Strings;

import java.util.Scanner;

/* 

// Question 1.
// Count how many times lower case vowels occurred ina 
// String entered by the user.

public class StringAssignment {
    public static int VowelCount(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // String str = "abacdeoueai";
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(VowelCount(str));

        String str1 = "Apnacollege".replace("2", "");
        System.out.println(str1);
        sc.close();
    }
}
 */
// Check if two Strings are anagram or not 
// Anagram condition 
// aabbcc == abacbc(aabbcc)

public class StringAssignment{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        int f1[] = new int[128];
        int f2[] = new int[128];

        for(int i=0; i<s1.length(); i++){
            f1[s1.charAt(i)]++;
        }
        for(int i=0; i<s2.length(); i++){
            f2[s2.charAt(i)]++;
        }
        int flag = 0;
        for(int i=0; i<128; i++){
            if(f1[i]!=f2[i]){
                flag = 1;
            }
        }
        if(flag==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        sc.close();
    }
}


