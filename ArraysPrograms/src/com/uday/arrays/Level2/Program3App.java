package com.uday.arrays.Level2;
import java.util.Scanner;
public class Program3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array to be Created : ");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter the "+arr.length+" values for the array : ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		Program3 program3 = new Program3();
		System.out.println("Enter the value to search in the array : ");
		int res = program3.search(arr,scan.nextInt());
		if(res>=0) {
			System.out.println("The element is present the Array..");
		}
		else {
			System.out.println("The element is not present in the array...");
		}
		scan.close();
	}

}
