package summation;

public class SumOfNumbers {
	public static void main(String[] args) {
		int sum = 0;
		int number = 1;
		
		// while loop - as long as number is less than 101
		// better when you don't know when your loop will end
		while (number <= 100) {
			sum = sum + number;
			number = number + 2;
		}
		System.out.println("while loop - sum of all odd numbers from 1 to 100 is " + sum);
		
		// for loop - if you know your loop will run a certain amount of times
		int forSum = 0;
		for (int i = 1; i <= 100; i++) {
			forSum += i;
		}
		System.out.println("for loop - sum of all numbers from 1 to 100 is " + forSum);
	}
}
