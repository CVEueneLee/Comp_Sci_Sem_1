import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int a = sc.nextInt();
		
		System.out.print("Enter another number");
		int b = sc.nextInt();
		
		 
		
		if(a%2 == 0){
			System.out.println("Your first number is even!: ");
		}
		else{
			System.out.println("Your first number is odd!: ");
		}
		
		
		if(b%2 == 0){
			System.out.println("Your second number is even!");
		}
		
		else{
			System.out.println("Your second number is odd!");
		}
		
		if(a%5 == 0){
			System.out.println("Your first number is divisible by 5");
		}
		else{
			System.out.println("Your first number is not divisible by 5");
		}
		
		if(a%4 == 0){
			System.out.println("Your first number is divisible by 4");
		}
		else{
			System.out.println("Your first number is not divisible by 4");
		}
		
		if(a%3 == 0){
			System.out.println("Your first number is divisible by 3");
		}
		else{
			System.out.println("Your first number is not divisible by 3");
		}
		
		
		
		if(b%5 == 0){
			System.out.println("Your second number is divisible by 5");
		}
		else{
			System.out.println("Your second number is not divisible by 5");
		}
		
		if(b%4 == 0){
			System.out.println("Your second number is divisible by 4");
		}
		else{
			System.out.println("Your second number is not divisible by 4");
		}
		
		if(b%3 == 0){
			System.out.println("Your second number is divisible by 3");
		}
		else{
			System.out.println("Your second number is not divisible by 3");
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
