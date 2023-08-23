package com.uday.arrays.Level1;
import java.util.Scanner;
public class Program1 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the length of the array to be created : ");
		int arr[]= new int[scan.nextInt()];
		System.out.println("Enter the values to be stored in the array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.print("The valus stored in the array are : ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		scan.close();
	}
}
