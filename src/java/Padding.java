package java;

import java.util.Scanner;

public class Padding {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                String formatStr;
                int x=sc.nextInt();
                //Complete this line
                int strLen=s1.length();
                int numLen=Integer.toString(x).length();
                
                
                for(int j = 0; j<15-strLen; j++){
                    s1 += " ";
                }
                formatStr = Integer.toString(x);
                while(numLen < 3){
                    formatStr = "0" + formatStr;
                    numLen++;
                }
                System.out.println(s1+formatStr);
            }
            System.out.println("================================");
            sc.close();

    }
}



