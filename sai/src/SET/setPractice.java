package SET;

import java.util.*; 
public class setPractice {
	public static void main(String[] args) {
		//Hashset use the -> hashmap  -->use the Array of nodes(key , value)
		
		//Set<Integer> hs = new HashSet<>();
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(10);
		hs.add(2);
		hs.add(85);
		hs.add(65);
		hs.add(5);
		hs.add(5);
		hs.add(85);
		System.out.println(hs);
		
		hs.remove(85);
		System.out.println(hs);
		
		System.out.println(hs.remove(1));
		System.out.println(hs.contains(65));
		
		
		
		
		
	}
}
