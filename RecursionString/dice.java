package RecursionString;

public class dice {
    public static void main(String[] args) {
        dicerun("",4);
    }

    private static void dicerun(String p, int target) {
        if(target==0)
        {
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++)
        {
         dicerun(p+i, target-i);   
        }

    }
    
}
