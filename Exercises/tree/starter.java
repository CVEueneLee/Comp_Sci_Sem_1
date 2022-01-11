class starter {
	public static void main(String args[]) {
		int a = 3;
    	for(int i=0; i<=a; i++) {
    		for(int j=0; j<i; j++) {
        		System.out.print(" ");
    			}
    	int b = (a - i) * 2 + 1;
    	for(int c = 0; c < b; c++) {
        	System.out.print("*");
    	}
      System.out.println();
    }
}
	
}


