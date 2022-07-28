package week3.day2.collections.homeassign;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Problem Statement : Print only duplicate values
		 * Expected output: 4 and 8
		 * 
		 * How to solve?
		 * 1) Regular for loop
		 * 2) Using Set
		 * 
		 * Using Set 
		 * 
		 * a) Add every element into Set
		 * b) If it is already there in the Set -> Print duplicate
		 * 
		 */
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		Set<Integer> dataSet = new LinkedHashSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			boolean add = dataSet.add(data[i]);
		if(add == false)
			System.out.println("already there in the Set is:" +data[i]);
		}
	}

}
