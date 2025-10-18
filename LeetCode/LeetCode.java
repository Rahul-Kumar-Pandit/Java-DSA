package LeetCode;

public class LeetCode {
    public static int countSeniors(String[] details) {
        int count = 0;
        for(int i=0; i<details.length; i++){
            String str = details[i];
            String num = "";
            num += str.charAt(11);
            num += str.charAt(12);
            int checker=Integer.parseInt(num);
            if(checker>60){
                count++;
            } 
        }
        return count;
    }


   public static void main(String[] args) {
    //     String  details[] = {"7868190130M7522","5303914400F9211","9273338290F4010"};
    //    System.out.println(countSeniors(details));

        int arr[] = {1,2,3,4,1};
        int max = 0;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max,arr[i]);
        }
        int freq[] = new int[max+1];
        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        
        System.out.println("Frequecy : ");
        for(int i=0; i<freq.length; i++){
            System.out.print(freq[i]+" ");
        }   
    } 
}


