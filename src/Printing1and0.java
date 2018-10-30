
public class Printing1and0 {

	  public static void main(String []args){
	         
	       for(int i = 0, peak = 10; i < peak; i++, System.out.println())
	       {
	           for(int j = 0; j < i; j++)
	           {
	                System.out.printf("%d ", (i+j)  % 2 == 0 ? 0 : 1);
	           }
	       }
	     }

}
