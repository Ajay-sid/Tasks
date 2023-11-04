package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Q4 write a program to convert list to Array.
 */

public class Day15_Q4 {
	
	public static void main(String[] args) {
		

		List<String> name = new ArrayList<>(List.of("hfk","89we","vbjv","fhks"));
		
		System.out.println(name);
		
		String [] array = name.toArray(new String [name.size()]);
		
		System.out.println(array);
		System.out.println(Arrays.toString(array));
		
	}

}
