package com.bridgelabz;

public class SecondLargestElementArray {
	 
	 public void getSecondLargest() {
	      int temp;
	      int a[] = {10, 20, 25,  96, 57};
	   

	      for(int i = 0; i<a.length; i++ ){
	         for(int j = i+1; j<a.length; j++){

	            if(a[i]>a[j]){
	               temp = a[i];
	               a[i] = a[j];
	               a[j] = temp;
	            }
	         }
	      }
	      System.out.println("The second largest number is: "+a[a.length-2]);
	   }
	 public static void main(String[] args) {
		 SecondLargestElementArray Obj=new SecondLargestElementArray();
		 Obj.getSecondLargest();
	 }
	
	}
