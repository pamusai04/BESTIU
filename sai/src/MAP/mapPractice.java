package MAP;

import java.util.*;
import java.util.Map.Entry;
public class mapPractice {
	public static void main(String[] args) {
		//creation of list
		Map<Integer, String> m = new Hashtable<>();
		
		//Addition of elelemnts into the map
		m.put(500050, "Hyderabad");
		m.put(603103, "Chennai");
		m.put(123456, "delhi");
		System.out.println(m);
		
		//retrival of the keys only 
		Set<Integer> keys = m.keySet();
		for(int k: keys) {
			System.out.print(k + " ");
		}
		
		//retrival of values
		
		Collection<String> values = m.values();
		for(String va : values) {
			System.out.println(va);
		}
		
		
		
		System.out.println("++++++++++++++");
		//retrivel of the value from the map based on key 
		System.out.println(m.get(603103));
		
		Set<Integer> keyss = m.keySet();
		for(Integer key : keyss) {
			System.out.println(key + " >>>>" + m.get(key));;
		}
		
		System.out.println("++++++++++++");
		
		System.out.println(m);
		//removing elements
		m.remove(123456);
		System.out.println(m);
		
		//removing elements by using key and values 
		
		m.remove(603103, "Chennai");
		System.out.println(m);
		
		//key is avalabule in map
		
		System.out.println(m.containsKey(500050));
		
		
		System.out.println(m.containsValue("Hyderabad"));
		
		
		System.out.println("*************");
		
		m.put(123456,"Banglore");
		System.out.println(m);
		
		/*
		m.clear();
		System.out.println(m);
		*/
		
		Set<Entry<Integer, String>> entries = m.entrySet();
		
		for(Entry<Integer,String> entry : entries) {
			Integer key= entry.getKey();
			String val = entry.getValue();
			System.out.println(key + " >>>>" + val);
		}
		
		//does't exist key insert new key and values
		m.putIfAbsent(123456,"bangularu");
		System.out.println(m);
		
		}
}
