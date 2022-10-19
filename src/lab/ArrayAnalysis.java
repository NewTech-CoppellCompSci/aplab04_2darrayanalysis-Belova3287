package lab;

/*
 * See the link for lab explanation
 * https://docs.google.com/document/d/1QGhcNy-QOFT-J1rOHgeXKv81b5yz0LfEpL_Dl3PPff8/edit#
 * 
 * 
 */

public class ArrayAnalysis {

	
	//#1
	public static int[][] createRandom(int row, int column, int min, int max){
		int[][] arr = new int[row][column];
		for (int i = 0; i < arr.length; i++) {
		//cycle through all'the rows
		for (int j = 0; j < arr[i].length; j++) { //cycle through all the columns on a given row
		int scope = max - min + 1;
		arr[i][i] = (int) (Math.random() * scope + min); //setting the elements in the array
		
			}
		}
		
		return arr;
	}
	
	
	//#2
	public static void printArray(int[][] arr)  {
		for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			
				}
				
				System.out. println();
		
		}
	}
	
	
	//#3
	public static int sumTotal(int[][] arr) {
			int sum = 0;
			for(int[] one: arr) {
			for (int two : one) {
			sum += two;
		 }
	  }
		return sum;
	}
	
	
	//#4
	public static double average(int[][] arr) {
		
		
		return (sumTotal(arr)) / (arr.length + arr[0].length);
	}
	
	
	//#5
	public static int findMin(int[][] arr) {
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr. length; i++) {
			for (int j = 0; j < arr[i]. length; j++) {
		
				min = Math.min(min, arr[i][j]);
			}
			System.out.println();
		}
		
		return min;
	}
	
	
	//#6
	public static int findMax(int[][] arr) {
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr. length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
		max = Math.max(max, arr[i][j]);
		
		}
		System.out.println();
		
		}
		return max;
	}
	
	//#7
	public static int[][] diffArrays(int[][] arr1, int[][] arr2){
		
		int differ= 0;
		String diff2 = " ";
		if (arr1.length != arr2. length) {
			return null;
		
		}else {
			int[][] diff = new int[arr1. length] [arr1[0].length];
			
			for (int i = 0; i < arr1.length; i++) { //cycle through all the rows
				for (int j = 0; j< arr1[i].length; j++) { //cycle through all the columns on a given row
			
					diff[i][j] = Math.abs (arr1[i][j]- arr2[i][j]); //setting the elements in the array
					diff2 += "" + + Math.abs (arr1[i][j] - arr2[i][j]) +" ";

				}
			}
		
		
		return diff;
		}
	}
	
	
	//#8
	public static int[][] transposeRow(int[][] arr1, int dist){
		int counter = 0;
		while (counter != dist) {
		//////////////////////////////////
		int[][] diff = new int[arr1.length] [arr1[0].length];
		for (int i = 0; i < diff.length; i++){ 
			for (int j = 0; j< diff[i].length; j++) { 
		diff[i][j] = arr1[i][i];
			}
		}
		///////////////////
		for (int i = 0; i < arr1.length; i++) {
			
			int[] last = diff[arr1.length-1];
		
			int count = 0;
		
			for (int j = i + 1; j< arr1.length && count == 0; count++) {
		
				if (i == arr1. length-1) {
		
					arr1[j]= arr1[j-1];
				}
			else{
		
		int[] holder;
		
			holder = diff[i];
			int[] holder2 = diff[j];
		
			arr1[j] = holder;
		}
		
		last = arr1[diff. length-1] ;
		arr1[arr1.length-1] = diff[diff.length-2];
		
			}
		}
		
		counter++;
		
		}
		return arr1;
	}

	
	
	//#9
	public static int sum3D(int[][][] arr) {
		
		
		return 0;
	}
	
	
	//#10
	public static double average3D(int[][][] arr) {
		
		
		return 0;
	}
	
	
	
	
	
	
}
