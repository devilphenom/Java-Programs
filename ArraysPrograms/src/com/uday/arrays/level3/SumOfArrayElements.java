package com.uday.arrays.level3;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Array Contents are : ");
		int sum =0;
		for(int i=0;i<=arr.length-1;i++) {
			sum += arr[i];
			System.out.println(arr[i]+" ");
		}
		System.out.println("The total of all the values in the array is : "+sum);
		scan.close();
	}

}
