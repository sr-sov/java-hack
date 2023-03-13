package java;

import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] strArr = s.split("[^a-zA-Z]");
        ArrayList<String> strList = new ArrayList<String>();
        //clean up array for empty indexes
        for(String str: strArr){
            if(str.length()>0){
                strList.add(str);
            }
        }
        System.out.println(strList.size());
        for(String item: strList){
            System.out.println(item);
        }
        scan.close();
    }
}

