import java.util.Scanner;
public class JPA
{
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) 
	{
        	test();
        	test();
        	test();
    	}
	
	public static void test() 
	{
        	System.out.print("Please enter one value: ");
		int n=keyboard.nextInt();		
		int result=1;	
	
		if((n>0)&&(n<=10)) 
		{
			for(int i=1;i<=n;i++)
			{
				result*=i; 
			}
			System.out.printf("%d!: %d\n",n,result);	
		}
		else
		{
        	System.out.println("Error,the value is out of range.");		
		}
    	}
}
