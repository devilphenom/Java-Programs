package com.uday.arrays.Level2;
import java.util.Scanner;

public class Problem2 {
	
	public static void reverseArray(int n) {
		int arr[] = new int[n];
		System.out.println("Enter "+arr.length+" Elements for array : ");
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Array Conetents are: ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Array Contents After Reversed are : ");
		for(int i = arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		scan.close();
	}	
}


