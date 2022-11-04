package com.bridgelabz;


public class ArrayElementAtOddPosition {
public void OddPositionElement() {  
		  
	    
        int [] arr = new int [] {12, 23, 44, 63, 75};  
  
        System.out.println("Elements of given array present on odd position: ");  
          
        for (int i = 1; i < arr.length; i = i+2) {  
            System.out.print(arr[i]+" ");  
        }  
    }
	public static void main(String[] args) {
		ArrayElementAtOddPosition Obj=new ArrayElementAtOddPosition();
		Obj.OddPositionElement();
	}
	

}
