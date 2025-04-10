package Array;

import java.util.Arrays;
import java.util.Stack;

public class specialDiscount {
  public static void main(String[] args)
  {
    int[] arr= {8,4,6,2,3};
   int[] a = finalPrices(arr);
   System.out.println(Arrays.toString(a));
  }

   public static int[] finalPrices(int[] prices) {
        int n=prices.length;
        Stack<Integer> st=new Stack();

        for(int i=n-1; i>=0; i--){
            // Remove elements from the stack that are greater than the current price
            while(!st.isEmpty() && st.peek()>prices[i]){
                st.pop();
            }
            
            // Get the discount from the stack or 0 if no valid discount
            int discount=st.isEmpty()?0:st.peek();
            
            // Push the original value before updating
            st.push(prices[i]);

            // Update the current price with the discount
            prices[i]-=discount;           
        }

        return prices;
    }
  }

