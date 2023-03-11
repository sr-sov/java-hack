package javahack;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoTest {

	 public static void main (String[] args) throws java.lang.Exception{
		 Scanner scan = new Scanner(System.in);
		 String[] line;
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 int countOdd=0;
		 int countEven=0;
		 int remainder=0;
		 
		 line = scan.nextLine().split(" ");
		 //zero is not counted as positive or negative
         for(String s: line){
        	 remainder=Integer.parseInt(s)%2;
        	 if(remainder != 0) {
        		 countOdd++;
        	 }
        	 else if(remainder == 0) {
        		 countEven++;
        	 }
         }
         System.out.println(countOdd);
         System.out.println(countEven);
         System.out.println(countOdd-countEven);
         System.out.println(Math.abs(countOdd-countEven));
		 
	 }
}
