package com.uday.arrays.level3;

public class Program3 {
	void sumOfArrays(int arr1[],int arr2[]) {
		int arr3[] = new int[arr1.length];
		for(int i =0;i<=arr3.length-1;i++) {
			arr3[i] = arr1[i]+arr2[i];
		}
		System.out.println("Elements of third array after adding first and second array arr : ");
		for (int i : arr3) {
			System.out.print(i+" ");
		}
	}
}
