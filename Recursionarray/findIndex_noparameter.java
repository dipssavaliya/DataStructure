package Recursionarray;

import java.util.ArrayList;

public class findIndex_noparameter {

	public static void main(String[] args)
	{
		int[] arr= {3,4,4,6,7};
		int target=4;
		System.out.println(findIndexMethodwithoutparameter(arr, target,0));
	}
//ArrayList<Integer> list = new ArrayList<>(); pass list as argumenet. here, we have differ references but single object of list
	private static ArrayList<Integer> findIndexMethodwithoutparameter(int[] arr, int target, int index) {
		//creating new list with each single call
		ArrayList<Integer> list = new ArrayList<>();
		
		if(index==arr.length)
		{
			return list;
		}
		//this will add the ans to that function calls only
		if(arr[index]==target)
		{
			list.add(index);
		}
		ArrayList<Integer> ansFromBelowCalls= findIndexMethodwithoutparameter(arr, target, index+1);
		//below line will be executed when stack will be empty
		list.addAll(ansFromBelowCalls);
		return list;
	}
}
