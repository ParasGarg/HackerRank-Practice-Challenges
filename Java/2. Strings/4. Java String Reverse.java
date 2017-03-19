import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        int front = 0;
        int end = A.length()-1;
        int flag = 1;
        
        while (front < end) {
            if (A.charAt(front) != A.charAt(end)) {
                flag = 0;
                System.out.println("No");
                break;
            }
            
            front++;
            end--;
        }
        
        if (flag == 1) {
            System.out.println("Yes");
        }
    }
}
