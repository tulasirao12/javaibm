package collectionsapi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		map.put("scott", "tiger");
		map.put("jack", "jill");
		map.put("polo", "lilli");
		map.put("jack", "rose");
		
		System.out.println("Scott: " + map.get("scott"));
		System.out.println("Polo: " + map.get("polo"));
		System.out.println("Jack: " + map.get("jack"));
		
		//print all keys and values without manually feeding keys
		Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
		 while (itr.hasNext()) {
			System.out.println(itr.next()); 
		 } 
		
		/*	for (Map.Entry<String, String> entry:map.entrySet()) {
				String key = entry.getKey();
				String value = entry.getValue();
				
				System.out.println(key + " = " + value);
			} */
		
		

	}

}
