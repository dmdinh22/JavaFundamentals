package polymorphism;

// needed for solving Knapsack problem
public class Item implements Comparable {
	private int value;
	private int weight;
	
	public Item(int value, int weight) {
		this.value = value;
		this. weight = weight;
	}

	@Override
	public int compareTo(Object o) {
		Item otherItem = (Item) o;
		
		// sort on value per unit weight
		double difference = this.value / (1.0 * this.weight) 
				- otherItem.value / (1.0 * otherItem.weight);
		
		// return negative int if this object is less than passed in object o
		if (difference < 0) {
			return -1;
		}
		
		// return 0 if they are equal
		if (difference == 0) {
			return 0;
		}
		// return positive int if this object is greater
		return 1;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
