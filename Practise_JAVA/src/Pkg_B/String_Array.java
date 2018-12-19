package Pkg_B;

import java.util.Scanner;

public class String_Array 
{

	public static void main(String[] args) 
	{
		int k; String temp; int i; int j;
		 String[] arr={"Dhruv","Sharma","Fab"};
			
			for (i=0;i<arr.length;i++)
			{
				int flag=1;
				for(j=1;j<arr.length-i;j++)
				{
					if (arr[i].compareTo(arr[j])>0)
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						flag=0;
					}
			}
				if(flag==0){	
				break;
					
				}
			}
					for( k=0;k<arr.length;k++)
						{
							System.out.print(arr[k] + ",");	
						}
	
	}
		
}

