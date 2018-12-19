package Pkg_B;

import java.util.Arrays;

public class Arr_SecondHighest_Int {

	public static void main(String[] args) {
		
		
		int[] Arr=new int[]{20,50,12,62,89};
		
		 Arrays.sort(Arr);
		
		
		for (int i=0;i<Arr.length-1;i++)
		{
			
			for(int j=i+1;j<Arr.length;j++)
			{
				
				if(Arr[i]<Arr[j])
				{	
					int temp;
					temp=Arr[j];
					Arr[j]=Arr[i];
					Arr[i]=temp;
					
				}
				else{
					continue;
				}
			}
			
		}
		System.out.println(Arr[1]);
	}

}
