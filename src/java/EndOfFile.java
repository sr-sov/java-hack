package java;

import java.io.*;
import java.util.*;

public class EndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int line = 1;
        while(scan.hasNext()){
            String s = scan.nextLine();
            System.out.println(line + " "+s);
            line++;
        }
        scan.close();
    }
}