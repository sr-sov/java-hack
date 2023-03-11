package javahack;

import java.io.*;
import java.util.ArrayList;

public class DemoTest4 {
	public static void main (String[] args) throws java.lang.Exception{
		String line;
	    BufferedReader  br  =  new  BufferedReader(new  InputStreamReader(System.in));
	    int lineCount = 0;
	    int size = 0;
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    String[] arrStr;
	    boolean isCyclic = false;
	    
		while((line=br.readLine())!=null)    
		{
			if(lineCount==0) {
				size = Integer.parseInt(line);
			}
			if(lineCount==1) {
				arrStr = line.split(" ");
				for(int i=0; i<size; i++) {
					int x = Integer.parseInt(arrStr[i]);
					if(list.contains(x)) {
						isCyclic = true;
					}
					list.add(x);
				}
				//System.out.println(list);
				if(isCyclic) {
					System.out.println(0);
				}
				else {
					System.out.println(1);
				}
				
			}
			
			lineCount++;
		}
		
	}
}
