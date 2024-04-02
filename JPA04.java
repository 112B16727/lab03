import java.util.Scanner;
public class JPA
{    	
	static Scanner keyboard=new Scanner(System.in);
	public static void main(String[] args) 
	{
        	int total = 0;   
        	int s = 0;       
        	int count = 0;   
        	double average; 
        
		while(true)
		{
			System.out.print("Please enter meal dollars or enter -1 to stop: ");
			s=keyboard.nextInt();		

			if(s!=-1)     
			{
				total+=s;  
				count++;   
			}
			else  
			{
				break;  
			}
		}     
		average=(double)total/count; 
  		System.out.println("餐點總費用:" + total);
        	System.out.printf(" %d 道餐點平均費用為: %.2f \n",count,average);
        }
}
