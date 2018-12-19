package Pkg_A;

		 class A1{
				 	int x1;int y1;	float x2; float y2;
				 	
	

		public A1(int x,int y){
			x1=x;y1=y;
			System.out.println(x1);
			 return;	
		 } 
		
		 
		public  A1(float x,float y){
			x2=x;y2=y;
			 System.out.println(x2);
			 return;	 
		 } 
		public double sum(){
			return x1+y1;
		}
	 }


	 class OverloadingConstructor {
			 
		public static void main(String[] args) {
			
			A1 a = new A1(2,3);		// Constructor is used only for initialization value(s) of method local variables
			System.out.println("Value of constructor sum =  " +a.sum());
	
			}

	}

	


