package com.uday.arrays.Level1;
import java.util.Scanner;
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements to be stored in the Array : ");
		int arr[]= new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements for the Array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Array Contents are : ");
		for (int i : arr) {
			if(i>=0) {
				System.out.print(i+" ");
			}
		}
		scan.close();
	}

}
