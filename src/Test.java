import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
	
		Random rand = new Random();
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter the number");
        int number = sc.nextInt();
        
        int []  array = new int[number];
        
        for (int i =0 ; i < number; i++)
        {
            int ran = rand.nextInt(10);
            System.out.println("Random Numbers " + ran);
            array[i] = ran;
        }
        
        int sum =0 ; 
        
        for (int num : array)
        {
               sum = sum + num;   
        }
        System.out.println("Sum  " + sum);
        
        int div = sum/number;
        
        int result = ( ((div*number) -sum) < div) ? div : div+1;
        
        System.out.println("Number required " +result);

}

}