package arrays;

import java.util.ArrayList;
//time complexity= n
public class LongestNumsOf1s {

	public static void main(String[] args) {
		int[] arr= {1,1,0,1,1,0,1,0,1,1};
	//Converting the array
		ArrayList<Integer> list= new ArrayList<Integer>();
		int countOfSequence= 0;
		
		for(int i =0; i< arr.length;i++) {
			if(arr[i]==1) {
				countOfSequence++;	
				if(countOfSequence>0 && i==arr.length-1){
					list.add(countOfSequence);
				}
		}
			else {
				if(countOfSequence>0){
					list.add(countOfSequence);
				}
				
				list.add(arr[i]);
				countOfSequence=0;
			}
		}
		
		System.out.println(list);
		int maxSequence=0;
		for(int i = 0; i< list.size();i=i+2) {
			int length= list.get(i);
			System.out.println("i= "+i+" : "+"number: "+ list.get(i) +" length: "+length);
			
			if(length<list.size()) {
				length+=1;
				System.out.println("i= "+i+" : "+"number: "+list.get(i)+ " after adding 1: "+length);
			}
			if((i+2<list.size())) {
				length+=list.get(i+2);
				
				System.out.println("i+2= "+ (i+2) +" : "+"number: "+list.get(i+2)+ " after i+2 adding: " +length);
			}
			if(length> maxSequence) {
				maxSequence =length;
			}
		}
		System.out.println("maxSequence: " +maxSequence);
	}
	}


