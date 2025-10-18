package LeetCode;

public class CharAt {
    public static String camelCase(String str){
        String result = "";
        for(int x=0; x<str.length(); x++){       
            char ch = str.charAt(x);
            if(Character.isUpperCase(ch)){
                result += " ";
                result += ch;
            }else{
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "";
        // System.out.println(camelCase(str));
        String res = camelCase(str);
        if(res != ""){
            System.out.println(res);
        }
    }
}