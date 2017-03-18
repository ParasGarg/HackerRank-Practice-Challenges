    import java.io.*;
    import java.util.*;

public class Solution {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            String output = ""; 
            
            if (n % 2 != 0) {
                output = "Weird";
            } else {
                if (n >= 2 && n <= 5) {
                    output = "Not Weird";
                } else if (n >= 6 && n <= 20) {
                    output = "Weird";
                } else if (n > 20) {
                    output = "Not Weird";
                }
            }
            
            System.out.println(output);
        }
    }
