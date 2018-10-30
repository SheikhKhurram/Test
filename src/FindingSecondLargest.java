import java.util.ArrayList;

public class FindingSecondLargest {

	public static void main(String[] args) {

		int[] array = { 1, 11, 30, 45, 5 };

              secondHighest(array);

	}

	public static void secondHighest(int[] array)
     {
		int first = array[0];
		int second = array[0];
		int third = array[0];

	  for (int i=0 ; i < array.length ;  i++)
	  {
		  if (array[i] > first)
		  {
			  first = array[i];
		  }
		  
		  
	  }
	  
	  for (int i=0; i < array.length;i++)
	  {
	  if ((array[i] > second) && (array[i] < first))
	  {
		  second = array[i];
	  }
	  }
	  
	  for (int i =0 ; i < array.length ;i++)
	  {
		  if (array[i] > third   && array[i] < second)
		  {
			  third = array[i];
		  }
	  }
	  
		
		System.out.println(first);
		
		System.out.println(second);
		
		System.out.println(third);
		
		
	}

}
