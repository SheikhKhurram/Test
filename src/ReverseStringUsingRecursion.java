
public class ReverseStringUsingRecursion {

	public static void main(String[] args) 
	{
	
            System.out.println(recursion("abcd"));
	}
 
	public static String recursion(String s)
	{
		
           if (s.length() ==  1) return s;
           
           return String.valueOf(s.charAt(s.length() -1)) + recursion(s.substring( 0 , s.length() -1));
}
}
