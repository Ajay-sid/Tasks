package day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * Q3 Create a TreeMap of emp ID and name
 * and print all names in alphabetic order
 * 
 */

public class Day15_Q3 {
public static void main(String[] args) {
	
	
	Map<Integer,String> mymap = new TreeMap<>();
	
	
	mymap.put(121, "Ajay");
	mymap.put(222, "Zayn");
	mymap.put(129, "Tanya");
	mymap.put(300, "Kylie");
	mymap.put(260,"Luther");
	mymap.put(333, "Berlin");
	
	// Before sort
	System.out.println(mymap);
	
	Collection<String> empNames = mymap.values();
	
	List<String> liname = new ArrayList<>(empNames);
	
	// After Sort
	Collections.sort(liname);
	for(String s : liname) {
		System.out.println(s);
	}
	
	
}
	

}
