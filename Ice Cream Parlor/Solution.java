import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] icecreamParlor(int m, int[] arr) {
        // Complete this function
        int money = m;
        int flavors = arr.length;
        int arr_return [] = new int [2];
        Map<Integer, Integer> complements = new HashMap<>();
            for(int i = 1; i <= flavors; i++)
            {
                int cost = arr[i-1];
                if(complements.containsKey(cost)){
                    arr_return [0] = complements.get(cost);
                    arr_return [1] = i;
                }
                else
                    complements.put(money-cost, i);
            }
        return arr_return;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int m = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            int[] result = icecreamParlor(m, arr);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }
            System.out.println("");


        }
        in.close();
    }
}
