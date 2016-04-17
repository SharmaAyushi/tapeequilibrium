package codility.timecomplexity.tapeequilibrium;

import java.util.stream.IntStream;

public class Solution {
	
	 public static int solution(int[] A) {
		 int firstPart = 0;
		 int totalSum = IntStream.of(A).sum();
		 int minimalDiff = totalSum;
		 for(int i = 0; i<A.length-1; i++){
			 firstPart +=A[i];
			 int difference = Math.abs(firstPart - (totalSum-firstPart));
			 if(i==0){
				 minimalDiff = difference;
			 }
			 minimalDiff = minimalDiff>difference ? difference:minimalDiff;
		 }
		 return minimalDiff;
	    }
	 
	 public static void main(String[] args) {
		int[] arr = {3,1,2,4,3};
		System.out.println(solution(arr));
	}

}
