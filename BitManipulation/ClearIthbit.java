package BitManipulation;

public class ClearIthbit {
    public static int clearIthBit(int num,int i){
        int bitmask = ~(1<<i);
        return num & bitmask;
    }

    public static int ClearIBit(int num,int i){
        int bitmask = (~0)<<i;
        return num & bitmask;
    }

    public static int ClearRangeofBIts(int num,int i,int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a|b;
        return num & bitmask;
    }

    // Question 
    // Check if a number is a power 2 or not
    public static boolean isPowerOfTwo(int num){
        return (num & (num-1))==0;
    }

    // Question
    // Count set Bits in a number 
    public static int CountsetBits(int num){
        int count = 0;
        while(num>0){
            if((num & 1)!=0){ // Check LSB
                count++;
            }
            num = num>>1;
        }
        return count;
    }

    // Fast Exponentiation (a^n)

    public static int FastExponentiation(int a,int num){
        int ans = 1;
        while(num>0){
            if((num & 1)!=0){
                ans = ans * a;
            }
            a = a*a;
            num = num>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        // System.out.println(ClearRangeofBIts(10,2,4));
        // System.out.println(isPowerOfTwo(7));
        // System.out.println(CountsetBits(8));

        System.out.println(FastExponentiation(3,5));
    }
}
