package com.kodnest.bs;

import java.util.Scanner;

class Solution {
	public static void main(String[] args) {
		int result = binarySearch();

		double a[] = {1.3,2.5,3.4,5.6};
		
		
		if(result == -1) {
			System.out.println("Target not found");
		}
		else {
			System.out.println("Target found at "+result);
		}
	}

	static int binarySearch() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter the size of an Array");
		int size = scan.nextInt();
		int a[] = new int[size];

		System.out.println("User! please enter the Array elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		
		System.out.println("User! please enter the target element"
				+ " to be searched");
		int target = scan.nextInt();
		int low = 0;
		int high = a.length-1;
		int mid = (low+high)/2;

		while(low <= high) {
			mid = (low+high)/2;
			if(target == a[mid]) {
				return mid;
			} else if(target > a[mid]) {
				low = mid + 1;
			}else if(target < a[mid]) {
				high = mid - 1;
			}
		}

		return -1;
	}
}
