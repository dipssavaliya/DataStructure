package TwoPointer;

public class moveZeros {
    public static void main(String[] args) {
        int[] arr ={2,1};
        moveZeroMethod(arr);
    }

    private static void moveZeroMethod(int[] arr) {
       int left=0;
       int right =0;
       while(right<arr.length && arr.length>1)
       {
         while(left<arr.length && arr[left]!=0  )
        {
            left++;
        }
        if(right>left && arr[right]!=0)
        {
            arr[left]=arr[right];
            arr[right]=0;
        }
        right++;
      }
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
    }
}
