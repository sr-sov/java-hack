package java;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Solution {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        int positive = 0;
        int negative = 0;
        int zeroes = 0;
        BigDecimal positiveRatio;
        BigDecimal negativeRatio;
        BigDecimal zeroesRatio;
        BigDecimal size = new BigDecimal(arr.size());
        for(Integer i: arr){
            if(i>0){
                positive+=1;
            }
            else if(i<0){
                negative+=1;
            }
            else{
                zeroes+=1;
            }
        }
        
        
        positiveRatio = new BigDecimal(positive).divide(size, 6, RoundingMode.UP);
        negativeRatio = new BigDecimal(negative).divide(size, 6, RoundingMode.UP);
        zeroesRatio = new BigDecimal(zeroes).divide(size, 6, RoundingMode.UP);
        
        
        System.out.println(positiveRatio);
        System.out.println(negativeRatio);
        System.out.println(zeroesRatio);
    
    }

}

public class BigDecimalProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Solution.plusMinus(arr);

        bufferedReader.close();
    }
}
