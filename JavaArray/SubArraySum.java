package JavaArray;

public class SubArraySum {
    public static void maxSubArraySum(int a[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<a.length; i++){
            int start = i;
            for(int j=i; j<a.length; j++){
                int end = j;
                currSum = 0;
                for(int k = start; k<=end; k++){
                    currSum = currSum + a[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum of Sum Array is : "+maxSum);
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        maxSubArraySum(a);
    }
}
