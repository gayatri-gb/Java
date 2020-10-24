package arrays;

import java.util.Arrays;
//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

//Return the array in the form [x1,y1,x2,y2,...,xn,yn].
public class ShuffleArray {
	
	public String shuffle(int[] nums, int n) {
		int x= 0, y=n;
		int[] result= new int[nums.length];
		for(int i = 0; i<nums.length;i=i+2 ) {
			result[i]= nums[x++];
			result[i+1]=nums[y++];
		}
		return Arrays.toString(result);
	}

	public static void main(String[] args) {
		ShuffleArray shuffle= new ShuffleArray();
		int[] nums= {2,5,1,3,4,7};
		int n= 3;
		System.out.println(shuffle.shuffle(nums, n));
	}

}
