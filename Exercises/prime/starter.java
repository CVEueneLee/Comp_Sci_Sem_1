import java.util.Scanner;
import java.util.Random;

class starter{
	
	public static String checkPrime(int a){
		int x = a;
		int i = 2, count = 0;
		while (i <= number / 2) {
	        if (number % i == 0) {
	            count++;
	            break;
	        }
	        i++;
	    }
	    if (count == 0) {
	        return true;
	    } else {
	        return false;
	    }
			
			
	}
	
	public static int printPrimes(int b){
		int counter;
		while(true){
			for(counter = b;counter<=1;counter--){
				if(checkPrime){
					System.out.println(counter);
				}
					
			}
		}
	}





	public static void main(String args[]) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("input an integer");
	    int b = scanner.nextInt();
	    System.out.println(printPrimes(b));
	
	        
	}
}
	


	



