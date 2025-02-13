package Java.LearnProgramming;

public class MaxItemInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,34,57,99,23};
		System.out.println(maxRange(arr, 0,4));
		System.out.println(max(arr));
	}
	
	static int maxRange(int[] arr, int startIndex, int endIndex) {
		
		 int maxVal = arr[startIndex]; //here we are considering start index value as maximum value
		 
		 for(int i=startIndex; i<= endIndex;i++) {
			 
			 if(arr[i] > maxVal ) {
				 maxVal = arr[i];
			 }
		 }
		 
		 return maxVal;
	}

	 static int max(int[] arr) {
		
		 int maxVal = arr[0]; //here we are considering first value as maximum value
		 
		 for(int i=0; i< arr.length;i++) {
			 
			 if(arr[i] > maxVal ) {
				 maxVal = arr[i];
			 }
		 }
		 
		 return maxVal;
	}

}
