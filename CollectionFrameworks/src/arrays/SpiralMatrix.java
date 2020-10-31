package arrays;

import java.util.ArrayList;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] array= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		ArrayList<Integer> elements = new SpiralMatrix().printSpriral(array);
	for (Integer spiral : elements) {
		System.out.println(spiral);
		
	}
	}

	ArrayList<Integer> printSpriral(int[][] array) {
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		int firstrow=0;
		int lastrow=array.length-1;
		int firstcol=0;
		int lastcol= array[0].length-1;
		while(firstrow<lastrow && firstcol<lastcol) {
		for(int i=firstcol; i<=lastcol;i++) {
			list.add(array[firstrow][i]);
		}
		
		for(int i=firstrow+1; i<=lastrow;i++) {
			list.add(array[i][lastcol]);
		}
	
		for(int i=lastcol-1; i>=firstcol;i--) {
			list.add(array[lastrow][i]);
		}

		for(int i=lastrow-1; i>firstcol;i--) {
			list.add(array[i][firstcol]);
		}
		
		
			firstrow++;
			firstcol++;
			lastrow--;
			lastcol--;
			
			
			
			
		}
		return list;
	}
}
