package com.bridgelabz;

public class PrintDuplicateElement {
	public void PrintDuplicate() {     
        
          
        int [] arr = new int [] {1, 3, 4, 2, 7, 8, 8, 3};   
          
        System.out.println("Duplicate elements in given array: ");  
       
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }
	public static void main(String[] args) {
		PrintDuplicateElement Obj=new PrintDuplicateElement();
		Obj.PrintDuplicate();
	}
	
}  

