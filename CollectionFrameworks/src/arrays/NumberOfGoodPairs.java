package arrays;

import java.util.HashMap;
//
public class NumberOfGoodPairs {
	
	public int nums(int[] array) {
		int goodPairs= 0;
		HashMap<Integer, Integer> hm= new HashMap<Integer, Integer>();
		for(int pairs: array) {
			if(hm.containsKey(pairs)) {
				goodPairs+=hm.get(pairs);
				
			}
		
			hm.put(pairs,hm.getOrDefault(pairs, 0)+1);
		

		}
		return goodPairs;
	}

	public static void main(String[] args) {
		NumberOfGoodPairs ngp= new NumberOfGoodPairs();
		int[] array= {1,2,3,1,1,3};
		System.out.println(ngp.nums(array));

	}

}
