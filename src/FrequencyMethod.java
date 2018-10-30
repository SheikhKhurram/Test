import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyMethod {

	public static void main(String[] args)
	{
	  
		Integer [] a =  {10,20,30,20,20};
		
		List<Integer> list  = Arrays.asList(a);
		
		
		int i = Collections.frequency(list, 20);
		
		System.out.println(i);
	}

}
