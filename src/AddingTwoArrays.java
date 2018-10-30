
public class AddingTwoArrays
{
 public static void main(String[] args) {
	
	 int [] array1 = {1 ,2 ,3};
	 
	 int []  array2 = {4,5,6};
	 
	 addingTwoArrays(array1, array2);
	 
}
 
 public static void addingTwoArrays(int [] arr1 , int[] arr2)
 {
     int arrays [] = new int[arr1.length + arr2.length]; 
     
     int i =0 ; 
  
     for (int k : arr1)
     {
    	 arrays[i] = k;
    	 i++;
     }
     
     for (int j : arr2)
     {
    	 arrays[i] = j;
    	 i++;
     }
     
    for(int a : arrays)
    {
    	System.out.print(a + " ");
    }
    
 }
 
 
}
