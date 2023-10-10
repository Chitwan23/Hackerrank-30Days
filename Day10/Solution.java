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



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        
        ;
      
        String[] groupings = Integer.toBinaryString(n).split("0");
        int max = 0;
        for(String s : groupings){
            if(max < s.length()){
                max = s.length();
            }
        }
        System.out.println(max);
    

        bufferedReader.close();
    }
}
