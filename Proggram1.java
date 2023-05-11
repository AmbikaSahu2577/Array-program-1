package com.exam;

import java.util.Scanner;

public class Proggram1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter size");
			int n = sc.nextInt();
			int arr[] = new int[n];
			System.out.println("enter element");
			
			for (int i = 0; i < arr.length; i++) 
			{
			   arr[i] = sc.nextInt();	
			}
			 
			System.out.println("array elements are");
			for (int i = 0; i < arr.length; i++) 
			{
				System.out.println(arr[i]);
			}
		}
	}

	}
	