
public class ArmStrongNumber {

	public static void main(String[] args) 
	{
         int num = 1634;
		
       System.out.printf("%s" , isNumberArmStrong(num)? "number is amstrong" : "Number is not amstrong" );
	}
   
	public static boolean isNumberArmStrong (int num)
	{
		double sum =0 ;
		int save = num;
		while (num > 0)
		{
			int digit = num%10;
			sum = sum + Math.pow(digit, (save+"").length());
			System.out.println(sum);
			num = num/10;
		}
		
		return sum == save ? true : false; 
	}
	
}
