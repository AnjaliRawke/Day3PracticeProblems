package com.bridgelabz;

public class SmallestElementOfArray {
	public void Smallest() {
		int a[]= {3,6,66,78,76};
		// Finding the largest element
		int Smallest = a[0];
		for (int i = 0; i < a.length; i++) {
		if (a[i] < Smallest)
			Smallest = a[i];
		}
		System.out.println("The Smallest Element of Array is " + Smallest);
		}
	public static void main(String[] args) {
		SmallestElementOfArray Obj=new SmallestElementOfArray();
		Obj.Smallest();
	}
		}

