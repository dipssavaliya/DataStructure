package String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class checkOccurance {
    public static void main(String[] args) {
        String s = "ababccf";
        System.out.println(checkOccuranceMethod(s));
    }

    private static boolean checkOccuranceMethod(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if(map.containsKey(c))
        {
            map.put(c,map.get(c)+1);
        }
        else {
            map.put(c,1);
        }
        }
        int value = map.get(s.charAt(0));
        boolean found = true;
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
           if(entry.getValue() != value)
           {
               return false;
           }
        }
        return true;
    }
}
