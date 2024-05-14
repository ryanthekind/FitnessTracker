package com.ryanthekind;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to my fitness app!");
		
		System.out.println("Workout 1:");
		System.out.println("------");
		System.out.println("REPS:");
		
		
		// make a four star right triangle
		for(int i=1; i<=4; i++) {
			System.out.print(i);
			
			for (int k=1; k<=i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
