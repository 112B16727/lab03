import java.io.*;
public class JPA {
    public static void main (String argv[]) throws IOException {
    	BufferedReader br = 
    			new BufferedReader(new InputStreamReader(System.in));
        int num1, num2;
        
        System.out.println("Input:");
        num1 = Integer.parseInt(br.readLine());
        
        while (num1 != 999) {
            num2 = Integer.parseInt(br.readLine());
            System.out.println(gcd(num1, num2));
            System.out.println("Input:");
            num1 = Integer.parseInt(br.readLine());
        }
    }  
  
    static int gcd (int m, int n) {
        int result = m, temp;
        while (n != 0){            
            if(m % n == 0) {
            	result = n;
            	break;
            }
            else {
            	temp = n;
            	n = m % n;
            	m = temp;
            }            
        }        
        return result;
    }
}
