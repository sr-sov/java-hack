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

class CountingSortMethod {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     * 
     * Another sorting method, the counting sort, does not require comparison. 
     * Instead, you create an integer array whose index range covers the entire range of values in your array to sort. 
     * Each time a value occurs in the original array, you increment the counter at that index. 
     * At the end, run through your counting array, printing the value of each non-zero valued index that number of times.
     */

    public static List<Integer> doCountingSort(List<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int[] frequencyArr = new int[100];
        List<Integer> frequencyList = new ArrayList<Integer>();
        Arrays.fill(frequencyArr, 0);
        
        
        for(int number: arr) {
        	frequencyArr[number] += 1;
        }
        System.out.println(Arrays.toString(frequencyArr));
        
        for(int i = 0; i < 100; i++) {
        	frequencyList.add(Integer.valueOf(frequencyArr[i]));
        }
        
        return frequencyList;
    }

}

public class CountingSort {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
        
        System.out.println(arr);

        List<Integer> result = CountingSortMethod.doCountingSort(arr);
        
        System.out.println(result);

        bufferedReader.close();

    }
}