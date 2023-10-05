package BackTracking;

public class maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        mazepath("",3,3);
    }

    private static int count(int r, int c) {
        if(r==1||c==1)
        {
            return 1;
        }
        int left = count(r-1, c);
        int right = count(r, c-1);
        return left+right;
    }

    private static void mazepath(String p, int r, int c)
    {
        if(r==1 && c==1)
        {
            System.out.println(p);
            return;
        }
        if(r>1 && c>1)
        {
            mazepath(p+'D', r-1, c-1);
        }
        if(r>1)
        {
            mazepath(p+'V', r-1, c);
        }
        if(c>1)
        {
            mazepath(p+'H', r, c-1);
        }
    }
    
}
