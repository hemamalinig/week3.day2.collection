package week3.day2.collections.homeassign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
				
				//       output= 7;

				/*
				 * Pseudo Code: 
				 * a) Create a empty Set Using TreeSet
				 * b) Declare for loop iterator from 0 to data.length and add into Set 
				 * c) converted Set into List
				 * d) Print the second last element from List
				 * 
				 * 
				 */
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> setOfdata =  new LinkedHashSet<Integer>();		
		for(int i=0; i<data.length; i++) {
			setOfdata.add(data[i]);		
			}
		System.out.println("set of data : "+setOfdata);
		List<Integer> listOfData = new ArrayList <Integer>(setOfdata);
		Collections.sort(listOfData);
		System.out.println("second max number : "+listOfData.get(listOfData.size()-2));	}

}
