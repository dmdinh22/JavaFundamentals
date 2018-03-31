package arrays;


public class Array {
	// array
	double[] rainfall = new double[365];
	
	public void Main(String[] args) {
		double sum = 0;
		for (int i = 0; i < rainfall.length; i++) {
			sum += rainfall[i];
		}
		double avgRainFall = sum / rainfall.length;
		System.out.println("Average rain fall is " + avgRainFall);                  
	}
}
	