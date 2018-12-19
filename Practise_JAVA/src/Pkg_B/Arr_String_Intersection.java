package Pkg_B;

public class Arr_String_Intersection {

	public static void main(String[] args) {
				
			String[] Arr={"One", "Two","Three"};
			String[] Arr1={"One1", "Two","Three"};
			String[] Arr3=new String[5];
			
			for(int i=0;i<Arr.length;i++)
			{
				for(int j=0;j<Arr1.length;j++)
				{
					if(Arr[i]==Arr1[j])
					{
						System.out.println("Common value are= " +Arr[i]);
						Arr3[i]=Arr[i];
					}
					else{
						continue;
						//System.out.print("hi");
					}
					
					
				}
				
				
			}

	}

}
