package Pkg_A;
	
	class human{
		String ears ="parent ears";
	}

	class dhruv extends human{
		String ears="Child Ears";
		void print(){
			System.out.println(ears);
			System.out.println(super.ears);
		
			
		}
		
		
	}




public class superKeyword {

	public static void main(String[] args) {
	dhruv obj = new dhruv();
	obj.print();
	

	}

}
