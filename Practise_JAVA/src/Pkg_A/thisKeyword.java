package Pkg_A;

//	class A11{
//		public void m()
//		{System.out.println("M method");}
//		
//		public void n()
//		{ this.m();   }	// this keyword used to call current class method ->Also by default compiler use 'this' for calling same class method
//				
	
	
	
	class thisKeyword {  
		void m(){  
		System.out.println(this);//prints same reference ID  
		}  
		public static void main(String args[]){ 
			
			thisKeyword obj=new thisKeyword();
			
		System.out.println(obj);//prints the reference ID  
		obj.m();  
		}  
		}  



