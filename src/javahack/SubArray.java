package javahack;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubArray {

    public static void main(String[] args) {
        /* 
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
         * Count the number of negative sub-arrays
        */
    	Scanner scan = new Scanner(System.in);
    	
    	int countNeg = 0;
    	int len = Integer.parseInt(scan.nextLine());
    	String[] str = scan.nextLine().split(" ");
    	int[] arr = new int[len];
    	for(int i = 0; i < len; i++) {
    		arr[i] = Integer.parseInt(str[i]);
    		System.out.println(arr[i]);
    	}
    	for(int i = 0; i < len; i++) {
    		int sum = 0;
    		for(int j = i; j < len; j++) {
    			sum = sum + arr[j];
    			if(sum < 0) {
    				countNeg++;
    			}
    		}
    	}
    	//System.out.println(Arrays.toString(arr));
    	System.out.println(countNeg);
    	
    	
    	
    	scan.close();
    }
}