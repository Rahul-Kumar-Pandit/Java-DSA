package LeetCode;

public class LeetCode165 {

    public static int compareVersion(String version1, String version2) {
        String[] num1 = version1.split("\\.");
        String[] num2 = version2.split("\\.");
        for(int i=0; i<num1.length || i<num2.length; i++){
            if(num1[i]==num2[i]){
                continue;
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        String version1 = "1.01";
        String version2 = "1.001";
        compareVersion(version1, version2);
    }
}

