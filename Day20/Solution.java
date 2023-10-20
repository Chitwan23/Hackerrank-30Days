import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;





public class Solution {

    public static int bubbleSort(int[] a, int n){
        int numSwaps = 0;
        for (int i = 0; i < n; i++) {
            int numberOfSwaps = 0;
            
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    //swap(a[j], a[j + 1]);
                    
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    
                    numberOfSwaps++;
                    numSwaps++;
                }
            }
            
            if (numberOfSwaps == 0) {
                break;
            }
        }
        return numSwaps;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        sc.close();
        
        int numSwaps = bubbleSort(a, n);
        
        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
    }
}

      
