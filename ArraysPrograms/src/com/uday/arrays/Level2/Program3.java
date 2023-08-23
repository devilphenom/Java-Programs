package com.uday.arrays.Level2;

public class Program3 {
	int search(int arr[],int target) {
		for(int i=0;i<=arr.length-1;i++) {
			if(target==arr[i]) {
				return 1;
			}
		}
		return -1;
	}
}
