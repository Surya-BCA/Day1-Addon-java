package core;

public class samforeach {
	int [][] numbers;
	public samforeach(){
	numbers = new int [][] {
		{1,2,3},
		{4,5,6},
		{7,8,9}
	
	};
	}
	public void samFor(){
	     System.out.println("entered numbers are ..........");
	     for(int[] r : numbers) {
	    	 for( int v : r) {
	    		 System.out.printf("%3d ", v);
	    		 
	    	 }
	     System.out.println();
	     
	     }
	     
	}
	}

