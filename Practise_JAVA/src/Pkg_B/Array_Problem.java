//package Pkg_B;
//
//public class Array_Problem {	// Sorting of Array using 3rd variable
//
//	public static void main(String[] args) {
//		int k; int temp; int i; int j;
//			int arr[]= new int[4];
//			arr[0]=1;
//			arr[1]=3;
//			arr[2]=4;
//			arr[3]=8;
//			
//			
//			for (i=0;i<arr.length;i++)
//			{
//				for(j=i+1;j<arr.length;j++)
//				{
//					if (arr[i]<arr[j])
//					{
//						temp=arr[i];
//						arr[i]=arr[j];
//						arr[j]=temp;
//					}
//			
//				}
//			}
//	for( k=0;k<arr.length;k++)
//	{
//	System.out.print(arr[k] + ",");	
//	}}}
//--------------------->>Sorting via User I/p >>>>>-----------

package Pkg_B;

import java.util.Scanner;

public class Array_Problem {	// Sorting of Array using 3rd variable

	public static void main(String[] args) {
		int k; int temp; int i; int j;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no. of elements :  ");
		int n=scan.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter list of random numbers : ");		
			
			for (i=0;i<n;i++)
			{
				for(j=i+1;j<n;j++)
				{
					if (arr[i]<arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
			
				}
			}
	for( k=0;k<n-1;k++)
	{
	System.out.print(arr[k] + ",");	
	}
	
	}}

