package collectionsapi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionsDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Microsoft");
		list.add("Google");
		list.addFirst("Apple");
		list.addLast("Apache");
		list.add(2, "Oracle");
		
		System.out.println("Iterating using for loop");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Iterating using for each loop");
		
		for(String i:list) {
			System.out.println(i);
		}
		System.out.println("iterating using iterator");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("IBM");
		ar.add("Apple");
		ar.add("jboss");
		ar.addAll(list);
		System.out.println("Iterating over merged collection");
		for(String e: ar)
			System.out.println(e);
		
		
		HashSet<String> hashset= new HashSet<String>(ar);
		System.out.println("Iterating over set collection");
		for(String e: hashset)
			System.out.println(e);
		
		TreeSet<String> ts = new TreeSet<String>(ar);
		System.out.println("Iterating over sorted collection");
		for(String e: ts)
			System.out.println(e);
	}
	
	

}
