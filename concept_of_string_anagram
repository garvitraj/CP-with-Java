import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
 
 class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int sum1 =0;
        int sum2 = 0;
        
        if (str1.length() != str2.length()){
            System.out.println("Not Anagrams");
        }

        for (int i =0 ; i<str1.length();i++){
            char temp1 = str1.charAt(i);
            char temp2 = str2.charAt(i);
            int t1 = (int) temp1;
            int t2 = (int) temp2;
            sum1 = sum1+t1;
            sum2 = sum2+t2;


        }
        if (sum1==sum2){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
}
