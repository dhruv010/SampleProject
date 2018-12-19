package Pkg_B;


import java.lang.StringBuffer;

public class Strings {

	public static void main(String[] args) {
		
	// StringBuffer str= new StringBuffer("123");
//		
//		
//		System.out.println(str.append("Waah 9ji waah 4 aaadmiyo me baat ban gyi"));
//	//	System.out.println(str.reverse());
//		System.out.println(str.length());
//		System.out.println(str.replace(3, 6, "4567"));
//		System.out.println(str.deleteCharAt(5));
//		System.out.println(str.insert(3, "Jai"));
		
		
	//	String str= new String("123");
		String input2="A1 b1 c1 d1 e1";
		String input="B1 b1 c1 d1 e1";
		 StringBuilder input1 = new StringBuilder();
		 input1.append(input);
		 //input1=input1.reverse(); 
		 int j=input1.length() -1 ;
		 for (int i=j;i>=0;i--)
		 System.out.print(input1.charAt(i));
		 System.out.println("");
		 int val=input.compareToIgnoreCase(input2);
		 System.out.println (val);
		 System.out.println (input2.equalsIgnoreCase(input));
		 System.out.println (input1.substring(4)); //'4' is start Index
		 System.out.println(input2.subSequence(2, 3));
	}

}

