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
public class bubble_sort_recursive {
    public static void main(String args[])
    {
        int a[]={10,5,4,2,1};
        sort(a,0,a.length-1);
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);
    }
    public static void sort(int a[],int f,int l)
    {
        int b=l;
        if(l>=0)
        {
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]>a[i+1])
            {
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        
        }
        sort(a,f,l-1);
        }
        else
        return;
    }
}