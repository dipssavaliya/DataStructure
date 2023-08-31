package BinarySearch;


public class versionControl {
	public static void main(String[] args)
	{System.out.println(firstBadVersion(5));
		
	}
	public static boolean isBadVersion(int n)
	{
		if(n==2||n==3)
		return true;
		else
			return false;
	}
  public static int firstBadVersion(int n) {
      int start =1;
      int end = n;
      while(start<=end)
      {
          int mid = start+(end-start)/2;
          if(isBadVersion(mid)==true)
              end=mid-1;
          else
              start=mid+1;
      }
      return start;

  }
}

