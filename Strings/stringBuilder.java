package Strings;

import java.util.ArrayList;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch<='z'; ch++){
            sb.append(ch);   // abcdefghijklmnopqrs.....
        }
        // System.out.println(sb);

        ArrayList<Character>list = new ArrayList<>();
        list.add('a');
        list.add('b');
        System.out.println(list);
    }
}
