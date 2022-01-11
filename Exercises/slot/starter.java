import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	

        System.out.println("You will start with $100 on this slot machine");
        System.out.println("The numbers on this slot machine are from 0 to 5, if 2 out of the 3 numbers rolled are the same, your wager will be doubled.");
        System.out.println("If it is a jackpot, the money you wagered will be tripled");
        System.out.println("If none of the numbers rolled are the same, you will lose the money that you wagered");
        
        int userAmount = 100;

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        String reply = "";
        int amountWagered = 0;
        while(true) {
        
            System.out.print("[current balance: " + userAmount + "] How much would you like to wager: ");
            amountWagered = Integer.parseInt(sc.nextLine());
            
            System.out.println();
            
            int x = rand.nextInt(6);
            int y = rand.nextInt(6);
            int z = rand.nextInt(6);

            System.out.println(x + " " + y + " " + z);
            System.out.println();

            if (x == y && x == z) {
                userAmount+=amountWagered*2;
            }
            else if(x == y || x == z || y == z) {
                userAmount+=amountWagered;
            }
            else {
                userAmount+=amountWagered*0;
                userAmount-=amountWagered;
            }
            
            System.out.println("Your current balance is: " + userAmount);
            
            if(userAmount == 0){
            	System.out.println("Since your balance is 0 or below 0, you cannot play anymore.");
            	break;
            }

            System.out.print("Would you like to play?: ");
            reply = sc.nextLine();
            if(reply.equals("Yes") || reply.equals("yes") || reply.equals("Y") || reply.equals("y")) {
                System.out.println("Ok we can play again!");
            }
            else if(reply.equals("No") || reply.equals("no") || reply.equals("N") || reply.equals("n")) {
                break;
            }
            else {
                System.out.println("I am going to assume that your answer was a YES :)");

            }


        }

        System.out.println("Come again!");

        sc.close();
    }
}
