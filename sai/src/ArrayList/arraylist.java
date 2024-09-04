package ArrayList;
import java.util.*;
public class arraylist {
	public static void main(String [] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(null);
		arr.add(5);
		
		Integer[] a = new Integer[] {1,2,3,4,5,6};
		ArrayList<Integer> ab = new ArrayList<Integer>(Arrays.asList(a));
		System.out.println(ab);
		System.out.println(ab.get(4));
		System.out.println(ab.size());
		System.out.println(ab.remove(0));
		System.out.println(ab.contains(5));  //containsAll();
		ab.set(0, null);
		System.out.println(ab);
		System.out.println(ab.isEmpty());
		System.out.println(ab.indexOf(5));
		
		//Collection.Synchronised(ab);
	}
}
