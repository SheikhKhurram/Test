
public class CheckingBinaryNumbers
{
    public static void main(String[] args) 
    {
	 	int a = 102;
	 	System.out.println(isBinaryNumber(a));
	}
    
    
    public static boolean isBinaryNumber(int number)
    {
    	int module;
    	while (number >0)
    	{
    		if (number == 0) return true;
    		
    		else if(number < 10)
    		{
    			number = number%10;
    			return (number==0 || number ==1) ? true : false;
    		}
    		
    		else 
    		{
    			number = number/10;
    		}
    		
    	}
    	return false;
    	
    	
    }
    
}
