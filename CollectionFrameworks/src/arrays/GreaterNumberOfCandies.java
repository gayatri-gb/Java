package arrays;

import java.util.ArrayList;

import java.util.List;

public class GreaterNumberOfCandies {

	public List<Boolean> candiesCount(int[] array, int extraCandies) {
		List<Boolean> ans = new ArrayList<Boolean>();
		int max = getMax(array);
		for (int i = 0; i < array.length; i++) {
			if (array[i] + extraCandies >= max) {
				ans.add(true);
			} else {
				ans.add(false);
			}
		}
		return ans;
	}

	private int getMax(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}

		}
		return max;
	}

	public static void main(String[] args) {
		GreaterNumberOfCandies gc = new GreaterNumberOfCandies();
		int[] array = { 2, 3, 5, 1, 3 };
		int extraCandies = 3;
		System.out.println(gc.candiesCount(array, extraCandies));

	}

}
