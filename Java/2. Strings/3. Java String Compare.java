import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int subStrLength = scan.nextInt();
        
        // considering first substring as minimum and maximum
        String minStr = "";
        String maxStr = "";
        for (int i = 0; i < subStrLength; i++) {
            minStr += str.charAt(i);
            maxStr = minStr;
        }
        
        String comStr = minStr;
        for (int i = subStrLength, len = str.length(); i < len; i++) {
            comStr = comStr.substring(1);
            comStr += str.charAt(i);
            
            // comparing substring
            minStr = (minStr.compareTo(comStr) > 0) ? comStr : minStr;
            maxStr = (maxStr.compareTo(comStr) < 0) ? comStr : maxStr;
        }
         
        // output
        System.out.print(minStr + "\n" + maxStr);
    }
}