package core;

import java.security.interfaces.ECPublicKey;

public class onedimensional {
	
 int [] marks;
 
 public onedimensional() {
	 
	/* marks = new int [5]; //Reserve Memory
	 
	 marks[0] = 10;
	 marks[1] = 20;
	 marks[2] = 30;
	 marks[3] = 40;
	 marks[4] = 50;
	 
 }*/
	 //Another way of initializing
	 marks = new int[] {10,20,30,40,50};
 }
 	public void Displayusingforloop(){
 		System.out.println("Display Using for loop");
 		for(int i=0;i<marks.length;i++)
 			System.out.println(marks[i]);
 	
 	}
 	public void display() {
 		System.out.println(marks [0]);
 		System.out.println(marks [1]);
 		System.out.println(marks [2]);
 		System.out.println(marks [3]);
 		System.out.println(marks [4]);
 	}
}
