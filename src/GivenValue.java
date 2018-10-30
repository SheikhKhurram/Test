import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GivenValue {

	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5,6};
       
		Scanner sc = new Scanner(System.in);
       
		System.out.println("Enter the number");

		int input = sc.nextInt();
       
       
      boolean value = givenValue(input, arr);
      if (value)
    	  System.out.println("Value is present in the given array");
      else 
    	  System.out.println("Value is not present in the given array");
  
	}
     public static boolean givenValue (int i , int[] array)
     {
    	 Set<Integer> list = new HashSet<Integer>();
    	 
    	 for (int k : array)
    	 {
    		 list.add(k);
    	 }
    	 
    	 return  list.contains(i);
    	 
    	
     }
}
