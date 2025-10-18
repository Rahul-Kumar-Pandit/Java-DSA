package JavaArray;

public class KadanesSubArraySum {
    public static void KadanesMax(int a[]){
        int cs = 0; //cs = currentSum
        int ms = Integer.MIN_VALUE; //ms = maxSum
        for(int i=0; i<a.length; i++){
            cs = cs+a[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Our maximum value is : "+ms);
    }
    public static void main(String[] args) {
        int a[] = {-2,4,-1,-3,3,-2,-3};
        KadanesMax(a);
    }
}
