package ArrayList;
import java.util.*;
public class vector{
	public static void main(String [] args) {
		
		Vector v1 = new Vector();
		v1.add("sai");
		v1.add("siva");
		v1.add(0,"lokesh");
		  
		Vector v2 = new Vector();
		v1.add("ab");
		v1.add("cd");
		v1.add("ed");
		v1.addAll(v2);
		System.out.println(v1);
		
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		System.out.println(v1.get(0));
		System.out.println(v1.remove("lokesh"));
		v2.clear();
		System.out.println(v1.size());
		System.out.println(v1);
		System.out.println(v1.contains("sai"));
		
		//update value
		v1.set(0,"j sai");
		System.out.println(v1);
		
		
		//vector inturdused - 1.0;
		// collection  - 1.2
		// generics 1.5 
		// generics ex : Vector<Integer> a = new Vector<Integer> ();
		//genecrics are specify the data type 
		
		Vector<Integer> arr = new Vector<Integer>();
		arr.add(null);
		arr.add(5);
		System.out.println(arr);
	}
}