/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.util.Scanner;
import java.util.Arrays;

/*           Runtime: O(n)     
    Space Complexity: O(1) by doing an "in place" rotation
*/
public class reverse_circular_array {
    public static void main(String[] args) {
        /* Read input and create array */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int q = scan.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        
        /* Rotate array (in place) using 3 reverse operations */
        k = k % n; // to account for cases where k > n
        reverse(array, 0, array.length - 1);
        reverse(array, 0, k - 1);
        reverse(array, k, array.length - 1);
        
        /* Print output */
        for (int i = 0; i < q; i++) {
            int m = scan.nextInt();
            System.out.println(array[m]);
        }
        scan.close();
    }
    
    /* Reverses array from "start" to "end" inclusive */
    public static void reverse(int a[], int start, int end)
    {
        while(start<=(a.length)/2 && end >=(a.length)/2)
        {
            int t=a[start];
            a[start]=a[end];
            a[end]=t;
            start++;
            end--;
        }
            
    }
    
}
