package javahack;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Array2D {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        //get largest hourglass in terms of their sum
        int sum=0,largest=Integer.MIN_VALUE;
        for(int k=0;k<4;k++){
            for(int j=0;j<4;j++){
                sum=arr.get(k).get(j)+
                arr.get(k).get(j+1)+
                arr.get(k).get(j+2)+
                arr.get(k+1).get(j+1)+
                arr.get(k+2).get(j)+
                arr.get(k+2).get(j+1)+
                arr.get(k+2).get(j+2);                       
                if(sum>largest){
                    largest=sum;
                }
            }
        }
        System.out.println(largest);
        bufferedReader.close();
    }
}
