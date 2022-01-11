import java.util.Scanner;
class starter {
public static int fact(int yea){
    int y = yea;
	int x = y-1;
	    while(true){
	        System.out.println(y);
	        y = y*x;
	        if(x==1){
	            return y;
	        }
	        x = x-1;
	    }
    
    
}


	public static void main(String args[]) {
	    
	    
	    //Part 2
	    Scanner sc = new Scanner(System.in);
	    int y = sc.nextInt();
	    int answer = fact(y);
	    System.out.println(answer);
	    
	    
	   //// int y = yea;
	  	// int x = y-1;
	   // while(true){
	   //     System.out.println(y);
	   //     y = y*x;
	   //     if(x==1){
	   //         break;
	   //     }
	   //     x = x-1;
	   // }
	    
	    
	    
	    
	    
	    //Part 1
// 		while(true){
// 		    for(int i = 25;i>=5;i--){
// 		        System.out.println(i);
		        
// 		    }
// 		    break;
// 		}
//     }
    
    

    
    

}
	
}


