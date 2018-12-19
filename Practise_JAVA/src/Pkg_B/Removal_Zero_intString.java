package Pkg_B;

import java.util.Arrays;

public class Removal_Zero_intString {

	public static void main(String[] args) {
		int[] Arr={123,0,5,3,1,0,0,8};
		int[] Arr3=new int[5];
		int[] Arr4=new int[5];
		int c=0;int c1 = 0;

		for(int i=0;i<5;i++)
		{
			
				if(Arr[i]==0)
					{
				Arr3[c]=Arr[i];
				c++;
				
					}
				else
				{
					Arr4[c1]=Arr[i];
					c1++;
				}
			}
		
		
		for(int k=0;k<5;k++){
				System.out.println("Zero items: " +Arr4[k]);
			
		}
			
		}


	}


