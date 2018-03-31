package testing;
import java.util.*;

public class NullPointerClass {
	ArrayList<Integer> ints;
	
	public int getNumInts() {
		return ints.size();
	}
	
	public static void main(String[] args) {
		NullPointerClass npc = new NullPointerClass();
		System.out.println(npc.getNumInts());
	}
}
