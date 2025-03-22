package Recursion;

import java.util.Stack;

public class decodeString {
    public static void main(String[] args) {
        decodeStringMethod("3[a2[c]]");//3[a]2[bc]
    }

    private static void decodeStringMethod(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=']'){
            stack.push(s.charAt(i));
            }
            else{
            StringBuilder sb = new StringBuilder();
            StringBuilder ischar = new StringBuilder() ;
            StringBuilder isDigi =new StringBuilder();
                while (!stack.isEmpty()) {
                    char c = stack.pop();
                    if (c != '[')
                        if(Character.isLetter(c))
                        {
                            ischar.insert(0, c);
                        }
                        else{
                            isDigi.insert(0, c);
                        }
                    }
                    String dig = isDigi.toString();
                    for(int j=0;j<Integer.parseInt(dig);j++)
                    {
                        sb.append(ischar);
                    }
                    System.out.print(sb.toString());
                    
            }
        }
    }
}


