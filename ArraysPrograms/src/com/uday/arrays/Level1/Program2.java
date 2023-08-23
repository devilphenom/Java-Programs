package com.uday.arrays.Level1;
import java.util.Scanner;
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number of Elements in the array : ");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter the "+arr.length+" Number of array elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]= scan.nextInt() ;
		}
		System.out.println("Array elements incremented by 5 are : ");
		for (int i : arr) {
			System.out.print((i+5)+" ");
		}
		scan.close();
	}

}
