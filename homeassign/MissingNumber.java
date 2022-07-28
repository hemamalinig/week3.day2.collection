package week3.day2.collections.homeassign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Problem 
		 * 
		 * There will be running number between 1 to 10
		 * One of the unique number will be missing
		 * Find the missing number
		 * 
		 * 
		 */		
		/*
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
		int[] runningNumber = {1,8,6,9,7,4,5,1,3,8,10,9,7,};
		Set<Integer> setOfNum = new LinkedHashSet<Integer>();	
		for(int i = 0; i<runningNumber.length; i++) {
			setOfNum.add(runningNumber[i]);
		}
		List<Integer> listOfNum = new ArrayList <Integer>(setOfNum);
		Collections.sort(listOfNum);
		for (int k=0; k<listOfNum.size(); k++)
		{
			if((listOfNum.get(k))+1!=(listOfNum.get(k+1)))
			{
				System.out.println("The missing number is "+((listOfNum.get(k))+1));
			}				
		}
		}	
}