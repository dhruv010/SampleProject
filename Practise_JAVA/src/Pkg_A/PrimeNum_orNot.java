package Pkg_A;

public class PrimeNum_orNot 
{
			
	public static void main(String[] args) 
	{
	
		int val=0;
		 int n=12;
		int m=n/2;
		if (n==0 ||n==1){
			
		
			System.out.println(n+ "isn't a prime number ");
		
		}
		else
		{		
				for (int i=2;i<=m;i++)
					if(n%i== 0)
					{
					System.out.println(n+ " is nat a prime number");
					val=1;
					break;
				
					}		
		
		
		if(val==0){
			
			System.out.println(n+ " is prime nummber");
		}
	
		}
	
	}
	

}


