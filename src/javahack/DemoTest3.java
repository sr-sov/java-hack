package javahack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DemoTest3 {
	public static void main (String[] args) throws java.lang.Exception
    {
		//sort list
		//n, list(n)
		Scanner scan = new Scanner(System.in);
		String line;
		String[] sizeArr;
		String[] arrStr;
		int size1;
		int size2;
		ArrayList<Integer> list = new ArrayList<Integer>();
		 
		line = scan.nextLine();
		sizeArr = line.split(" ");
		size1 = Integer.parseInt(sizeArr[0]);
		size2 = Integer.parseInt(sizeArr[1]);
		System.out.println(size1);
		System.out.println(size2);
		line = scan.nextLine();
		arrStr = line.split(" ");
		for(int i=0; i<size1; i++) {
			list.add(Integer.parseInt(arrStr[i]));
		}
		line = scan.nextLine();
		arrStr = line.split(" ");
		for(int i=0; i<size2; i++) {
			list.add(Integer.parseInt(arrStr[i]));
		}
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		for(int item: list) {
			System.out.println(item);
		}
    }
}
