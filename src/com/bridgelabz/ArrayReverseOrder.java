package com.bridgelabz;

public class ArrayReverseOrder {
	public void Reverse() {
	
		 
		int b[]  =  {1, 2, 3, 4, 5}; 
		System.out.println("The Reverse Order Of Given Array :");
          
        //Loop through the array in reverse order  
        for (int i = b.length-1; i >= 0; i--) {  
        	
            System.out.println(b[i] + " ");  
        }  
    }
	public static void main(String[] args) {
	
		ArrayReverseOrder Obj=new ArrayReverseOrder();
		Obj.Reverse();
		
	}
}