package arrays;

import java.util.Arrays;

public class RunningSumOf1dArray {
	public String runningSum(int[] array) {
		for(int i = 1;i < array.length;i++) {
			array[i]+=array[i-1];
		}
		
		return Arrays.toString(array);
		
	}
	
	public static void main(String[] args) {
		
		RunningSumOf1dArray runningSum = new RunningSumOf1dArray();
		int[] array = {1,2,3,4};
		System.out.println(runningSum.runningSum(array));
		
		
	}
}