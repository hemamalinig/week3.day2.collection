package week3.day2.collections.homeassign;

import java.util.List;
import java.util.ArrayList;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		 *input: int[] a={3,2,11,4,6,7};
		 *        int[] b={1,2,8,4,9,7};
		 *output:2,4,7
		 *
		 * a) Declare An Array for {3,2,11,4,6,7};	 
		 * b) Declare another Array for {1,2,8,4,9,7};
		 * c) create a two empty Lists - list1 & list2
		 * c) Declare for loop iterator from 0 to array a.length and add into list1
		 * d) Declare for loop iterator from 0 to array b.length and add into another list2
		 * e) Compare Both list1 & list2 using a nested for loop
		 *    1)Print the matching number
		 *  
		 */
		int[] a={3,2,11,4,6,7};
		int[] b={1,2,8,4,9,7};
//		converted a[] in to list
		List<Integer> list1 = new ArrayList<Integer>();
		for(int i = 0; i<a.length; i++) {
			list1.add(a[i]);
//			System.out.print(a[i]);
		}
//		converted b[] in to list
		List<Integer> list2 = new ArrayList<Integer>();
		for(int j = 0; j<b.length; j++) {
			list2.add(b[j]);
//			System.out.print(b[j]);
		}
//		 list 1 with list 2 to find matching number
		for(int k=0; k<list1.size(); k++ ) {			
			for(int l=0; l<list2.size(); l++) {
				if(list1.get(k) == list2.get(l)) {
					System.out.println(list1.get(k));
				}					
			}
			
			
		}
		
		
	}

}
