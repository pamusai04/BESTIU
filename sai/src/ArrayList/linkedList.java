package ArrayList;
import java.util.*;
public class linkedList {
	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<>();
		arr1.add("s1");
		arr1.add("s2");
		arr1.add("s3");
		
		
		LinkedList<String> arr = new LinkedList<>();
		arr.add("y1");
		arr.add("y2");
		arr.add("y3");
		arr.add(1,"yy"); // you perform the vector operations also 
		arr.addAll(arr1);
		System.out.println(arr);
		
		arr.remove("s3");
		System.out.println(arr);
		
		arr.set(3,"s4");
		System.out.println(arr);
		
		System.out.println(arr.get(0));
		
		System.out.println(arr.contains("y1"));
		arr.clear();
		System.out.println(arr);
		
		
	}
}
