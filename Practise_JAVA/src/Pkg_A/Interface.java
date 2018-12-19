package Pkg_A;

	 interface a 	
	 			{
		
		void method();
	 			}
	 
	class B11 implements a	
		{
		
		public void method(){ System.out.println("Dhruv Sharma");
			
		}
		}

public class Interface {

	public static void main(String[] args) {
		B11 obj = new B11();
		obj.method();
		
	}

}
