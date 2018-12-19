package Pkg_B;

import java.util.HashMap;


public class HashMap_Problems {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1, "Dhruv");	map.put(2, "Dhruv_01");	map.put(3, "Dhruv_02");	 map.put(2, "Dhruv_03");map.put(2, "Dhruv");
		
		String str=map.get(2);
		System.out.println(str);
	
		
		
		

	}

}
