package Pkg_B;

import java.util.ArrayList;

public class Arr_List {

	public static void main(String[] args) {
		
			ArrayList<String> arr= new ArrayList<String>();
			arr.add(0, "Dhruv");
			arr.add(1, "Sharma");
			arr.add(2, "is handsome");
			arr.isEmpty();
			
			
			for(int i=0;i<arr.size();i++)
			{
				System.out.println("" +arr.get(i));
				
				
			}
	

	}

}
