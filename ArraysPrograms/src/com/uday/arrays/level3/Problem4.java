package com.uday.arrays.level3;

public class Problem4 {
	public static void replacer(int arr[]) {
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]<0) {
				arr[i]=0;
			}
		}
		System.out.println("Array Elements after Replacing : ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
