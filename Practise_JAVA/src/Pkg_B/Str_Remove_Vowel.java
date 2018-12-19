package Pkg_B;

import java.util.Scanner;

public class Str_Remove_Vowel {

	public static void main(String[] args) {
		
		
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter value here:  ");
			String input= scan.nextLine();
			String newInput=input.replaceAll("[add]", ""); // For Removing specified characters from String
			System.out.println(newInput);

	}

}
