package javafsdpracticeproject;

import java.util.*;

public class AP29Map {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>(); 
		hm.put(1,"Tim");
		hm.put(2,"Mary");
		hm.put(3,"Catie");
		System.out.println("\nThe Elements of HashMap are");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(4, "Ales");
		ht.put(5, "Rosy");
		ht.put(6, "Jack");
		System.out.println("\nThe elements of Hashtable");
		for(Map.Entry n:ht.entrySet()) {
			System.out.println(n.getKey()+" "+n.getValue());
		}
		
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		map.put(8,"Annie");
		map.put(9, "Carolette");
		map.put(10, "Catie");
		
		System.out.println("\nThe elemnts of TreeMap are");
		for(Map.Entry i:map.entrySet()) {
			System.out.println(i.getKey()+" "+i.getValue());
		}
	}
}
