

//									||-------Non-RECURSIVE METHOD---------||

//package Pkg_A;
//import java.util.Scanner;		
//
//public class Fibonacci_Series {
//	
//    public static void main(String []args){
//       int a=0; int b=1; int c; int usr;
//       
//       Scanner in = new Scanner(System.in);
//    
//     System.out.print("Enter an integer =");
//     usr = in.nextInt();
//     System.out.println("You entered integer = " + usr);
//      
//      System.out.print(a+ " " +b );
//     
//       for(int i=2;i<usr;i++)
//       
//       {
//           c=a+b;
//           a=b;
//           b=c;
//         System.out.print(" " +c);
//           
//       }
//    }
//
//}

//  										||-------RECURSIVE METHOD---------|| 
// Where method call itself till specific condition met
package Pkg_A;
import java.util.Scanner;

public class Fibonacci_Series {
	 static int n1=0,n2=1,n3=0;    
	 static void printFibonacci(int usr){    
	    if(usr>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         printFibonacci(usr-1);    
	     }    
	 }   
	 
	
    public static void main(String []S)
    {
    	 Scanner in = new Scanner(System.in);
    	   
    	    System.out.print("Enter an integer = ");
    	    int usr = in.nextInt();
    	    System.out.println("You entered integer = " + usr);
    	    System.out.print(n1+ " " +n2);
    	   printFibonacci(usr-2);
    	    
   
    	   }  
    }  

    


