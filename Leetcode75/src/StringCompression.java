import java.util.HashMap;

public class StringCompression {
    public static void main(String[] args) {
        char[] ch ={ 'a','a','a','b','b','b','b','b','c','c','c'};
        System.out.println( "length is: " +stringCompressionMethod(ch));
        //System.out.println("string = "+s);
        //System.out.println("length is = "+s.length());
    }

    private static int stringCompressionMethod(char[] chars)
    {
        int index = 0;
        int start =0;
        while(start<chars.length)
        {
            int end =start;
            while(end<chars.length && chars[start]==chars[end])
            {
                end++;
            }
            int count = end-start;
            chars[index] = chars[start];
            index++;
            if(count>=2)
            {
                char[] freq = Integer.toString(count).toCharArray();
                for(char ch : freq)
                {
                    chars[index++]=ch;
                }
            }
            start = end;
        }
        for(char ch : chars)
        {
            System.out.print(ch);
        }
        return index;
    }
}
