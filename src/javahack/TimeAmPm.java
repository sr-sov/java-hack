package javahack;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ConvertTime {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
		DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ssa", Locale.ENGLISH);
		LocalTime inputTime = LocalTime.parse("12:01:00AM", df);
		//LocalTime inputTime = LocalTime.parse(s, df);
		System.out.println(inputTime);
		DateTimeFormatter timeOnly = DateTimeFormatter.ISO_TIME;
		String test = inputTime.format(timeOnly);
		System.out.println(test);
		
		int i = 010;
		int j = 070;
		System.out.println(i);
		System.out.println(j);
		return test;
    }

}

public class TimeAmPm {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        String s = bufferedReader.readLine();

        String result = ConvertTime.timeConversion(s);


        bufferedReader.close();

    }
}
