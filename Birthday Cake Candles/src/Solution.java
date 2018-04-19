import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    static int birthdayCakeCandles(int n, int[] ar) {
        /*
         * Author: Ankit chaurasia
         */
        Hashtable h = new Hashtable();
        int biggest_val = 0;
        int ar_count[] = new int [3];
        for(int i=0;i<n;i++){
        	if(biggest_val < ar[i]) {
        		biggest_val = ar[i];
        	}
        	if(h.get(ar[i])== null)  {
        		h.put(ar[i] , (1));
        	}else {
        		h.put(ar[i], (int)h.get(ar[i]) + 1);
        	}
        }
        return (int)h.get(biggest_val);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] ar = new int[n];

        String[] arItems = scan.nextLine().split(" ");

        for (int arItr = 0; arItr < n; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = birthdayCakeCandles(n, ar);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }
}
