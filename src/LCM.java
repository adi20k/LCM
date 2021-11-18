import java.util.Scanner;

class NegativeInputException  extends RuntimeException  
{  
    public NegativeInputException (String str)  
    { 
        super(str);  
    }  
}  

public class LCM {
	
	 static int getLCM(int a, int b, int c) {
	        int lcm = Math.max(Math.max(a, b), c);
	           
	        while(true) {
	            if (lcm % a == 0 && lcm % b == 0 && lcm % c == 0) {
	                return lcm;
	            }
	            lcm++;
	        }
	    }
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three numbers" );
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();	 
		  
		  try  
	        {  
			  if(a < 0 || b < 0 || c < 0)
				  throw new NegativeInputException("Invalid Input");
			  else
				  System.out.format("The LCM  is: %d\n", getLCM(a, b, c));
	        }  
	        catch (NegativeInputException e)  
	        {  
	            System.out.println("Exception occured: " + e);  
	        }  

	}

}
