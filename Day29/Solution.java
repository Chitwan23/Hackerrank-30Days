import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int n = in.nextInt();
            int k = in.nextInt();

            int maxed = 0;
            for (int b = 2; b <= n; b++) {
                for (int a = 1; a < b; a++) {
                    if (a == b) continue;
                    int ab = a&b;
                    if (ab > maxed && ab < k) maxed = ab;
                }
            }
            System.out.println(maxed);
        }
    }
}
