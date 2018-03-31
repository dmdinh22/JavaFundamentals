package testing;

public class ScoreReport {
	
	double calculateAverage(int[] array) {
		int sum = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			sum = sum + array[i];
		}
		double average = (1.0 + sum - 1.0) / array.length;
		return average;
	}
	
	double stadardDev(int[] array) {
		double average = calculateAverage(array);
		double dev = 0;
		for (int i = 0; i < array.length; i++) {
			dev = dev + Math.pow(Math.abs(array[i] - average), 2);
		}
		double variance = dev / array.length;
		return Math.sqrt(variance);
	}
	
	public static void main(String[] args) {
		int[] scores = new int[] {99, 95, 93, 88, 86, 85, 85, 80, 78, 79, 65, 58};
		ScoreReport report = new ScoreReport();
		double deviation = report.stadardDev(scores);
		double average = report.calculateAverage(scores);
		double myScore = 96;
		if (myScore >= average + deviation) {
			System.out.println("I should get an A");
		} else {
			if (myScore > average) {
				System.out.println("I might get an A-");
			} else {
				System.out.println("I didn't do well in this course.");
			}
		}
	}
}
