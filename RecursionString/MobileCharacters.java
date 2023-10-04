package RecursionString;
import java.util.ArrayList;

public class MobileCharacters
{
    public static void main(String[] args) {
        ArrayList<String> ret = padret("","23");
        System.out.println(ret);
    }
    static ArrayList<String> padret(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0)-'0';
        ArrayList<String> ans = new ArrayList<>();
        for(int i=(digit-1)*2;i<digit*2;i++)
        {
            char ch = (char)('a'+i);
            ans.addAll(padret(p+ch, up.substring(1)));
        }
        return ans;
    }
}