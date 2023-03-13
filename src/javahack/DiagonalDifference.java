package javahack;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

	 public static int getDiagonalDifference(List<List<Integer>> arr) {
	        // Write your code here
	        int leftDiagonal = 0;
	        int rightDiagonal = 0;
	        int size = arr.size();
	        for(int i = 0; i < size; i++){
	            leftDiagonal += arr.get(i).get(i);
	            System.out.println(leftDiagonal+"left");
	            rightDiagonal += arr.get(i).get(size-i-1);
	            System.out.println(rightDiagonal+"right");
	        }

	        return Math.abs(leftDiagonal - rightDiagonal);
	    }
	 public static void main(String[] args) {
		 List<List<Integer>> listOfLists = new ArrayList<List<Integer>>();
		 List<Integer> arr1 = new ArrayList<Integer>();
		 List<Integer> arr2 = new ArrayList<Integer>();
		 List<Integer> arr3 = new ArrayList<Integer>();
		 
		 arr1.add(1);
		 arr1.add(2);
		 arr1.add(3);
		 
		 arr2.add(4);
		 arr2.add(5);
		 arr2.add(6);
		 
		 arr3.add(9);
		 arr3.add(8);
		 arr3.add(9);
		 
		 listOfLists.add(arr1);
		 listOfLists.add(arr2);
		 listOfLists.add(arr3);
		 
		 int diagonal = getDiagonalDifference(listOfLists);
		 System.out.println("Absolute Diagonal Difference: "+ diagonal);
	 }
}
