package com.uday.arrays.Level2;
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Elements in the Array : ");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" values of the array : ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Array Contents are : ");
		for (int i : arr) {
			System.out.print(i+" ");
			System.out.println();
		}
		System.out.println("Enter the index of the two values that has to swapped : ");
		int index1 = scan.nextInt();
		int index2 = scan.nextInt();
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp; 
		
		System.out.println("Array after Swapped : ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		scan.close();
	}

}
