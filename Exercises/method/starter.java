import java.util.Scanner;
import java.util.Random;

class starter {
	public static String multDiv3(int a, int b){
		int x = a;
		int y = b;
		int product = x * y;
		
		if(product % 3 == 0){
			return "it is divisible by 3";
		}
		
		else{
			return "it is not divisible by 3";
		}
	}
		
		
		
		
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input a number");
	    int a = sc.nextInt();
	   	System.out.println("Input a number");
	    int b = sc.nextInt();
	    System.out.println(multDiv3(a,b));
	    

	   
	   
	   
	    
	        
	        
	    }
	
    }

	



