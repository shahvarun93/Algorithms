/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.util.*;
 
public class Heapsort_alex {
 
   private static int[] a;
   private static int n;
   private static int left;
   private static int right;
   private static int largest;
 
 
   public static void buildheap(int []a) {
      n = a.length-1;
      for(int i=n/2; i>=0; i--){
         MaxDownHeap(a,i);
      }
   }
 
   public static void MaxDownHeap(int[] a, int i) { 
      left = 2*i+1;
      right = 2*i+2;
 
      if(left <= n && a[left] > a[i]){
         largest=left;
      } else {
         largest=i;
      }
 
      if(right <= n && a[right] > a[largest]) {
         largest=right;
      }
      if(largest!=i) {
         exchange(i, largest);
         MaxDownHeap(a, largest);
      }
   }
 
   public static void exchange(int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t; 
   }
 
   public static void sort(int[] myarray) {
      a = myarray;
      buildheap(a);
      for(int i=n; i>0; i--) {
         exchange(0, i);
         n=n-1;
         MaxDownHeap(a, 0);
      }
   }
 
   public static void main(String[] args) {
      int []numbers={5,3,2,7,8};
      System.out.println(Arrays.toString(numbers));
      sort(numbers);
      System.out.println(Arrays.toString(numbers));
   }
}