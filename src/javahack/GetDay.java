package javahack;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        String dateStr="";
        int[] age = {20, 21, 30};
        
        
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, year);
        date.set(Calendar.MONTH, month-1);  //Gregorian Calendar starts month at 0
        date.set(Calendar.DAY_OF_MONTH, day);
        //date.set(2023,2,8);
        
        
        System.out.println(date.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(date.get(Calendar.DAY_OF_WEEK));
        System.out.println(date.get(Calendar.DAY_OF_MONTH));
        System.out.println(date.get(Calendar.YEAR));
        System.out.println(date.get(Calendar.MONTH));
        System.out.println(date.get(Calendar.DAY_OF_YEAR));
        System.out.println(date);
        
        SimpleDateFormat dateForm = new SimpleDateFormat("MM/dd/Y");
        
        System.out.println(new SimpleDateFormat("EEEE").format(date.getTime()));
        System.out.println(dateForm.format(date.getTime()));
        
        return dateStr;
    }

}

public class GetDay {
    public static void main(String[] args) throws IOException {
    	Scanner scan = new Scanner(System.in);

        int month = scan.nextInt();

        int day = scan.nextInt();

        int year = scan.nextInt();

        String res = Result.findDay(month, day, year);
        scan.close();

    }
}
