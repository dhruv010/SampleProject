package Pkg_A;
	
	
 class A4{
	 
	 public int MethodA(int x,int y){
		 System.out.println("Method INT");
		 return x+y;
		 
		
	 } 
	
	 
	 public float MethodA(float x,float y){
		 System.out.println("Method FLOAT");
		 return x+y;	 
	 } 
 }


 class OverloadingMethod {
		 
	public static void main(String[] args) {
		
		A4 a = new A4();
		System.out.println(a.MethodA(1.3f, 2.3f));
	

	}

}
