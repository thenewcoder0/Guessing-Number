package org.guess;
import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		Random r= new Random();
		
		int computerchoice=r.nextInt(100)+1;
		
		System.out.println("Welcome to the Number Guessing game");
		System.out.println("Select the Numbers between 1-100");
		
		int guess=0;
		int numberofattempts=0;
		
		while(guess!=computerchoice) {
			System.out.println("Enter your Guessing Number:");
			guess=s.nextInt();
			numberofattempts++;
		
		if(guess < computerchoice) {
			System.out.println("The Guessed Number is Too Low");
		}
		else if (guess>computerchoice) {
			System.out.println("The guessed number is Too High");
		}
		else {
			System.out.println("The Guessed Number is correct");
		}
		}
		s.close();
		}
	}

