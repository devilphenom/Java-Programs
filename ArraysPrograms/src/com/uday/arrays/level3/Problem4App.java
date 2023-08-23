package com.uday.arrays.level3;

import java.util.Scanner;

public class Problem4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array : ");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter the Elements for the array : ");
		for(int i = 0 ;i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		Problem4.replacer(arr);
		scan.close();
	}

}
