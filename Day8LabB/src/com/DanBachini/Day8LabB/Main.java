package com.DanBachini.Day8LabB;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int userNumber;
		try {
		System.out.print("Please enter a number between 1 and 10: ");
		userNumber = scanner.nextInt();
		System.out.println(systemResponse(userNumber));
		scanner.close();
		} catch (Exception e) {
			System.out.println("Wow, you really messed that one up...");
		}
	}
	public static String systemResponse(int userInt) {
		if(userInt >= 1 && userInt <= 10) {
			return "Yay, you can follow basic instructions!";
		}
		else return "I did not ask for this -_-...";	
	}
	
}

