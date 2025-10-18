package LeetCode;

public class SplitCharacter {
    public static String[] splitCharacter(String str){
        int n = str.length();
        if(n%2 != 0){
            str += '_';
        }
        StringBuffer sb = new StringBuffer(str);
        for(int i=1; i<=n; i++){
            if(i%2 == 0){
                sb.insert(i,":");
            }
        }
        String s = sb.toString();
        String[] result = s.split(":");
        return result;
    }
    public static void main(String[] args) {
        String str = "abcdef";
        String result[] = splitCharacter(str);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}
