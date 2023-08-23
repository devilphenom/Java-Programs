package com.uday.arrays.level3;

import java.util.Scanner;

public class Probelem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Two Arrays : ");
		int arr1[] = new int[scan.nextInt()];
		int arr2[] = new int[scan.nextInt()];
		System.out.println("Enter the Elements for the first array : ");
		for(int i = 0 ;i<=arr1.length-1;i++) {
			arr1[i] = scan.nextInt();
		}
		System.out.println("Enter the Elements for the Second array : ");
		for(int i=0 ;i<=arr2.length-1;i++) {
			arr2[i] = scan.nextInt();
		}
		System.out.println("Elements of the first array are : ");
		for (int i : arr1) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Elements of the Second array are : ");
		for (int i : arr2) {
			System.out.print(i+" ");
		}
		System.out.println();
		int arr3[] = new int[arr1.length+arr2.length];
		for(int i=0;i<=arr1.length-1;i++) {
			arr3[i] = arr1[i];
		
		}
		int help = 0;
			for(int j =arr1.length;j<arr1.length+arr2.length;j++) {
				arr3[j]=arr2[help++];
			}
		System.out.println("Final array after Merging 2 arrays are : ");
		for (int i : arr3) {
			System.out.print(i+" ");
		}
		scan.close();
	}

}
