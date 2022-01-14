package week3.day2homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
		
		Collections.sort(list);
		
		int size = list.size();
		int secondLargest = list.get(size-2);
		
		System.out.println("Second Largest " + "of " + list + " is " +secondLargest);
		

	}

}
