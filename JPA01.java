import java.util.*;
class JPA301 
{
	public static void main(String argv[]) 
	{
        	Scanner keyboard=new Scanner(System.in);
		System.out.println("Input:");			
		int n=keyboard.nextInt();    
		
		int sum=0;
        	for (int i=1;i<=n;i++) 
		{
        	    sum+=i;             
        	}
        	System.out.println("1 + ... + "+n+" = "+sum);
    	}	
}
