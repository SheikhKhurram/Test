
public class FindingRemaingArea {

	public static void main(String[] args)
	{
          int[][] sq1 = {{0,0} , {4,4}};
          int [][] sq2 = {{0,0},{3,4}};
         Object o =  isRemaining(sq1 , sq2);
         System.out.println(o.toString());
	}

	public static Object isRemaining(int[][] sq1, int[][] sq2) {

		if ((sq1[0][0] <= sq2[0][0]))
		{
            int area1 = Math.abs(sq1[1][0]*sq1[1][1]);
            int area2 = Math.abs(sq2[1][0]*sq2[1][1]);
            
            int remainingY = Math.abs(sq2[1][0] - sq1[1][1]);
            remainingY = remainingY == 0 ? sq1[1][1] : remainingY;
            int remainingX = Math.abs(sq2[0][0] - sq1[0][0]);
            remainingX = remainingX == 0 ? sq1[1][0] : remainingX;
            
            int area =  remainingY*remainingX;
            
            return area;
			
		}
        
		return false;
	}

}
