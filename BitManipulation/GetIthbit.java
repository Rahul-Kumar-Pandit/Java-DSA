package BitManipulation;

public class GetIthbit {
    public static int getIthBit(int num,int i){
        int bitmask = 1<<i;
        if((num & bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(10, 1));
    }
}
