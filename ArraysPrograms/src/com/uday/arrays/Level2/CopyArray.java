package com.uday.arrays.Level2;
import java.util.Scanner;
public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array : ");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" values for array : ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Original array elements are : ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		int newarr[] = new int[arr.length];
		for(int i=0;i<=newarr.length-1;i++) {
			newarr[i] = arr[i];
		}
		System.out.println("The copy of the array are : ");
		for (int i : newarr) {
			System.out.print(i+" ");
		}
		scan.close();
	}

}
