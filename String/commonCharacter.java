package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class commonCharacter {
    public static void main(String[] args) {
        String[] arr= {"flower","fool","fltds"};
        List<String> ls = commonChars(arr);
        for(String s:ls)
        {
            System.out.println(s);
        }
    }

    public static List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<String>();
        int length = words.length;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<length;i++){
            String s = words[i];
            for(int j=0;j<s.length();j++){
                char c = s.charAt(j);
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }


        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+":"+entry.getValue());
            if(entry.getValue()>= words.length)
            {
                list.add(String.valueOf(entry.getKey()));
            }
        }
        return list;
    }
}
