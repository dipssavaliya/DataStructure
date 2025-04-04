package Array;

import java.util.ArrayList;

public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] st = new String[]{"flower","flow","flight"};
        String s = longestCommonPrefix(st);
    }

    public static String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];
       for(int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
       }
       return prefix;
    }
}

