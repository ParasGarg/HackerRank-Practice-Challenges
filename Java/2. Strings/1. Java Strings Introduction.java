import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        // printing sum of lengths
        System.out.println(A.length() + B.length());
        
        // lexicographically order
        int len = -1;
        if (A.length() < B.length())
            len = A.length();
        else 
            len = B.length();

        for (int i = 0; i < len; ) {
            if (A.charAt(i) > B.charAt(i)) {
                System.out.println("Yes");
                break;
            } else if (A.charAt(i) < B.charAt(i)) {
                System.out.println("No");
                break;
            } else {
                i++;
                if (i == len) {
                    System.out.println("No");
                    break;
                }                    
            }            
        }
        
        // printing with first letter capital
        A = Character.toUpperCase(A.charAt(0)) + A.substring(1);
        B = Character.toUpperCase(B.charAt(0)) + B.substring(1);
        System.out.println(A + " " + B);        
    }
}
