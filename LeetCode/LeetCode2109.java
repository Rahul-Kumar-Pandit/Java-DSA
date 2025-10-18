package LeetCode;

public class LeetCode2109 {
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder(s);
        for(int i=0; i<spaces.length; i++){
            int idx = spaces[i];
            result.charAt(idx);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn";
        StringBuilder res  = new StringBuilder(s);
        int[]space = {8,13,15};
        int count = 0;
        for(int i=0; i<space.length; i++){
            int idx = space[i];
            res.insert(idx+count++," ");
        }
        System.out.println(res);
    }
}