package Pkg_A;
// Multiple Objects of same class access static variable from same memory location
//using static keyword program become memory efficient- otherwise each object require new variable/method with new memory location 
  class D1{
	  static {			//Static Block executed even before main() method
			 
			 int i=12;
			 System.out.println("Static block");
		 } //*************
	 
	 static int a1=10;
	 static void MethodA1(){
		 int a;
		 System.out.println("Static Method");
	 }
	 
 }
 class D2 extends D1{
	
	 static int a2=10;
	//
	 
	  void D2(){
		a1=11;
		 System.out.println("Static Method =  " +D1.a1);
	 
 }
	 }


public class StaticFinalClass {

	public static void main(String[] args) {
		D2 obj = new D2();
		
		
		D1.MethodA1(); //Static method called in main class by ClassName
		obj.D2();
	}

}

 
