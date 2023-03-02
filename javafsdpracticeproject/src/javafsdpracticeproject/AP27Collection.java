package javafsdpracticeproject;

import java.util.*;

public class AP27Collection {
	public static void main(String[] args) {
		System.out.println("ArrayList");
		ArrayList<String> city = new ArrayList<String>();
		city.add("Bangalore");
		city.add("Delhi");
		System.out.println(city);
		
		System.out.println("\nVector");
		Vector<Integer> v = new Vector();
		v.addElement(15);
		v.addElement(30);
		System.out.println(v);
		
		System.out.println("\nLinkedList");
		LinkedList<String> names = new LinkedList<String>();
		names.add("Alex");
		names.add("Jhon");
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("\nHashset");
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(101);
		set.add(102);
		set.add(103);
		System.out.println(set);
		
		System.out.println("\nLinkeHashSet");
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		set2.add(11);
		set2.add(12);
		set2.add(13);
		set2.add(15);
		System.out.println(set2);
	}
}
