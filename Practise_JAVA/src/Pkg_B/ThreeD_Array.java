package Pkg_B;

public class ThreeD_Array {

	public static void main(String[] args) {
		int[][][] arr={{{1,9,7,4},{6,4,2,6},{2,5,3,2}}};
		
		
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
				System.out.print(arr[i][j][k] +", ");
				
				}
				
				System.out.println();
			} 
		
				
		}

}

	}


