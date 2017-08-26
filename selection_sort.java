/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;
import java.util.*;
import java.io.*;

/**
 *
 * @author shahv
 */
public class selection_sort {
    public static void main(String args[])
    {
        int a[]={5,4,3,2,1};
        selection(a,a.length-1);
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
    public static void selection(int a[],int n)
    {
        
        for(int i=0;i<n;i++)
        {
            int temp=i;
            int j=i+1;
            while(j<=n)
            {
                if(a[j]<a[temp])
                {
                    temp=j;
                    
                }
                j++;
            }
            int p=a[i];
            a[i]=a[temp];
            a[temp]=p;
    }
        //return;
}
}