package java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LonelyInteger {
	/*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        int count = 0;
        Collections.sort(a);
        int lonely=a.get(0);
        
        for(int i = 0; i < a.size(); i++){
            if(lonely==a.get(i)){
                count++;
            }
            else{
            	/*since it is sorted and we are sure that there is ONLY one lonely integer
            	* then if the immediate next number is different while count is still 1, the previous number must be the lonely integer
            	*/
            	if(count==1) {
            		break;
            	}
            	//else, keep searching; we still haven't found the lonely integer
            	else {
                    lonely=a.get(i);
                    count=1;
            	}

            }
        }
        
        /*
        System.out.println(a.size());
        System.out.println(a);
        System.out.println(count);
        System.out.println(lonely+"\n***");
        */
        if(count<=1){
            return lonely;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
    	String s = ("59 88 14 8 85 1 94 74 57 96 39 2 47 43 35 17 53 52 92 31 99 "
    			+ "48 94 30 92 60 32 45 88 13 39 50 22 65 89 46 65 76 57 67 99 35 "
    			+ "76 46 85 82 45 62 53 80 74 22 31 52 82 13 41 96 2 1 80 62 4 20 "
    			+ "50 89 59 67 60 8 41 14 47 48 17 4 43 30 32");
    	String[] strArr = s.split(" ");
    	List<Integer> arrInt = new ArrayList<Integer>();
    	for(String i: strArr) {
    		arrInt.add(Integer.parseInt(i));
    	}
    	System.out.println(lonelyinteger(arrInt));
    }
}
