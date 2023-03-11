package javahack;

import java.io.*;
import java.util.ArrayList;

public class Main
{  
	public boolean contains(char c, char[] arr) {
		for(char x: arr) {
			if(x == c) {
				return true;
			}
		}
		return false;
	}
	public static String removeBadCharsByArr(String s) {
		char[] strArr = s.toCharArray();
		char[] newArr = new char[strArr.length];
		return newArr.toString();
	}
	public static String removeBadChars(String s) {
		//String regex =  "[^a-zA-z]";
		String regex =  "[aeoui]";
		String cleanStr = s.replaceAll(regex, "");
		System.out.println(cleanStr);
		return cleanStr;
	}
	
	public static boolean isPalindrome(String s) {
		String cleanStr = removeBadChars(s);
		char[] originalArr = cleanStr.toCharArray();
		int arrLen = originalArr.length;
		int counter = arrLen-1;
		int i = 0;
		char[] reversedArr = new char[arrLen];
		for (char c: originalArr) {
			reversedArr[counter-i]=c;
			i++;
		}
		String reverseStr = String.valueOf(reversedArr);
		if(cleanStr.toLowerCase().equals(reverseStr.toLowerCase())) {
			return true;
		}
		return false;
	}

    public static void main (String[] args) throws java.lang.Exception
    {
    //use the following code to fetch input from console
     String line;
     int i = 0;
     String input = "";
     
     BufferedReader  br  =  new  BufferedReader(new  InputStreamReader(System.in));
     
     while((line=br.readLine())!=null && i<1) {
    	 if(i==0) {
    	 input = line; 
    	 }
    	 i++; 
     }

     String output = removeBadChars(input);
     boolean result = isPalindrome(input);
     System.out.println(result);
     
     
    }  
     
}