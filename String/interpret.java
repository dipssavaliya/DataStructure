package String;

import java.util.Stack;

public class interpret {
    public static void main(String[] args) {
        String s = "G()(al)";
        interpretMethod(s);
    }

    private static void interpretMethod(String s) {
        Stack<Character> stack= new Stack<Character>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
           

        }

        System.out.println(sb.toString());

    }
}
