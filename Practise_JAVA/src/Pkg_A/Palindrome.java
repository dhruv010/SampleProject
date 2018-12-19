package Pkg_A;
import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		int r; int sum;int rev=0;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter value: ");
		int a=obj.nextInt();
		System.out.println("Value enter by user = " +a);
		int temp=a;
		while(a>0)
		{
			r=a%10;
			rev=rev*10 + r; // Multiply bcoz make it (3x10+4=>34) 
			a=a/10;
			
		}
		
		if(temp==rev){
			System.out.println("It's Palindrome");
			
		}
		else{
			System.out.println("Not Palindrome");
		}
		
		

	}

}
