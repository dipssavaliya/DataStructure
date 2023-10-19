package LeetcodePractice;

public class subarraySum {
    public static void main(String[] args) {
    int[] arr= {5,4,-1,7,8};
    System.out.println("Max element is : "+subarraySumMethod(arr));     
    }

    private static int subarraySumMethod(int[] arr) {
            int max=arr[0];
            int current=arr[0];
            for(int i=1;i<arr.length;i++)
                {
                    current=Math.max(arr[i],current+arr[i]);
                    max=Math.max(max,current);
                }
                return max;
    }
   private static int longmethod(int[] arr)
   {
       int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {    int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum=sum+arr[k];
                    if(sum>max)
                    {
                        max=sum;
                    }
                }
            }
        }
        return max;

   }
    
}

