import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, scan.nextInt() - 1);
        calendar.set(Calendar.DAY_OF_MONTH, scan.nextInt());
        calendar.set(Calendar.YEAR, scan.nextInt());
        
        Date date = calendar.getTime();
        
        String[] dayCode = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        System.out.println(dayCode[date.getDay()]);
    }
}
