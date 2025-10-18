package LeetCode;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        if(digits[digits.length-1]<9){
            digits[digits.length-1] += 1;
            return digits;
        }
        int n = digits.length-1;
        for(int i=n; i>=0;){
            while(digits[i]==9){
                i--;
                digits[i] = 0;
            }
            if(digits[i]!=9){
                digits[i] += 1;
                return digits;
            }else{
                int result[] = new int[digits.length+1];
                result[0] = 1;
                return result;
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = {8,9,9,9};
        int result[] = plusOne(arr);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
