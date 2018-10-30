import java.util.Scanner;

public class PrintingPrimeNumbers {

	public static void main(String[] args)
	{
	   
		Scanner sc = new Scanner(System.in);

         System.out.println("Enter the starting number");
         int start = sc.nextInt();
         System.out.println("Enter the ending number");
         int end = sc.nextInt();
         
         primeNumbers(start, end);
	}

	public static void primeNumbers(int start , int end)
	{
	  
			for (int i =start ; i<=end; i++)
			{
				   int count =0 ;
				for (int j = 2 ; j<= Math.sqrt(end) ; j++)
				{
				     if ( i == 1)
				     {
				    	 count++;
				    	 break;
				     }
				else if ((i%j == 0))
				    {
				    count++;
					break;
				    }
				}
				if (count ==0) System.out.println(i);
			}
		}
		
	}
	