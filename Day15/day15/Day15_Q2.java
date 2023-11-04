package day15;
/*
 * Q2 . Creating array list of strings
 * 	and removing all elements
 * */

import java.util.ArrayList;
import java.util.List;

public class Day15_Q2 {
public static void main(String[] args) {
	
	List<String> nameList = new ArrayList<>();
	
	nameList.add("Ajay");
	nameList.add("sid");
	nameList.add("java");
	nameList.add("selenium");
	nameList.add("Api");
	nameList.addAll(List.of("TestNg","cucumber",""));
	
	System.out.println(nameList);
	
	nameList.clear();
	
	System.out.println(nameList);
	
	
	
}
	
	
	
}
