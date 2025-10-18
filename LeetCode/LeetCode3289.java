package LeetCode;
public class LeetCode3289 {
        public static int getMax(int[] nums) {
            int max = 0;
            for (int i = 0; i < nums.length; i++) {
                max = Math.max(max, nums[i]);
            }
            return max;
        }

        public static int[] getSneakyNumbers(int[] nums) {
            int max = getMax(nums);
            int freq[] = new int[max + 1];
            for (int num : nums) {
                freq[num]++;
            }
            for(int i=0; i<freq.length; i++){
                System.out.print(freq[i]+" ");
            }
            int result[] = new int[2];
            int idx = 0;
            for (int i = 0; i < freq.length; i++) {
                if (freq[i] == 2) {
                    if (idx < 2) {
                        result[idx++] = i;
                    } else {
                        break;
                    }
                }
            }
            return result;
        }

    public static void main(String[] args) {
        int[] arr = {7,1,5,4,3,4,6,0,9,5,8,2};
        int result[] = getSneakyNumbers(arr);
        System.out.println();
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] +" ");
        }
    }
}
