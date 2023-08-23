package com.uday.arrays.Level2;
import java.util.Scanner;
//Linear Search 
public class FindElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter the "+arr.length+" elements for the array : ");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the element that you have to search in the array : ");
		int key = scan.nextInt();
		for(int i=0;i<=arr.length-1;i++) {
			if(key == arr[i]) {
				System.out.println("Element found : "+arr[i]);
				return;
			}
			scan.close();
		}
		System.out.println("Element Not in Array...!");
		
	}
	
}
