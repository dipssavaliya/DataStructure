package Sorting;

import java.util.Arrays;

public class AllSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        selectionSort(arr);
       System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for(int i=1;i<arr.length;i++)
        {
            int currElement=arr[i];
            int prevIndex=i-1;
            while(prevIndex>=0 && arr[prevIndex]>currElement)
            {
                arr[prevIndex+1]=arr[prevIndex];
                prevIndex--;
            }
            arr[prevIndex+1]=currElement;
        }
    }
    
    public static void countingSort(int[] arr)
    {
        //counting array
        int[] countingArr = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(countingArr[i]==arr[i])
            {
                countingArr[i]=countingArr[i]+1;
            }
            else
            {
                countingArr[i]=1;
            }
        }
        //sorting arr
        for(int i=0;i<countingArr.length;i++)
        {
            
        }
    }
}
