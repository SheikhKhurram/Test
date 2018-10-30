import java.util.HashMap;
import java.util.Map;

public class CommonElementInArrays 
{
 public static void main(String[] args) 
 {
	 String [] a = {"a","b","c"};
	 String [] b = {"a","z","c"};
	 System.out.println(commonElement(a,b));
}
 
 public static String commonElement (String[] a , String [] b)
 {
	   String s = "";
	  if (a.length < 1 || b.length < 1) return 0 + "";
	  
	  Map<String , String> map = new HashMap<String , String>();
	  
	  for(String num : a)
	  {
	  map.put(num, num);
	  }
	  
	  for (String num : b)
	  {
		  if (map.containsKey(num)) 
		  {
			  s = s + num + " ";
		  }
	  }
	  return s;
 }
 
}
