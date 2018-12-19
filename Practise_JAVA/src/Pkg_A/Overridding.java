package Pkg_A;

	 class F
	{
		
		 void run()
			{
			
			System.out.println("Parent method");
			//this.run();
			}
		
	}
	
	
class B1 extends F{
	 void run(){		
		System.out.println("CHILD method");
	
	}
		
		
	}
public class Overridding  {

	public static void main(String []s)
	{
		
		F obj = new B1();	// Parent instance variable can refer to child class but NOT vice-versa
		obj.run();
		
		
	}

}
