package TwoPointer;

public class moveZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,1,13,5,0,9,0,2,0,0};
        moveZeroMethod(arr);
    }

    private static void moveZeroMethod(int[] arr) {
       int left=0;
       int right =0;

       for(int i=0;i<arr.length;i++){
           if(arr[i]==0){
               left=i;
           }
           if(arr[i]!=0)
           {
               arr[left]=arr[i];
               arr[i]=0;
               left++;
           }
           right++;
       }

       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
    }
}
