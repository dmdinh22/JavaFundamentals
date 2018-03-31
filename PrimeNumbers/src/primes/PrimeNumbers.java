package primes;

import java.util.*;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a positive integer please: ");
		int userInput = scanner.nextInt();
		
		System.out.println("The user enered: " + userInput);
		
		/*
		 * prime number is divisible by 1 and the number itself
		 *  x % y computes remainder with modulus 
		 */
		int potentialFactor = 2;
		while (userInput % potentialFactor != 0) {
			// increment 
			potentialFactor++; 
		}
		if (potentialFactor == userInput) {
			System.out.println("The number is prime.");
		} else {
			System.out.println("The number is NOT prime, factor is: " + potentialFactor);
		}
	}
}
