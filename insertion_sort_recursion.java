/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

/**
 *
 * @author shahv
 */
public class insertion_sort_recursion {
    public static void main(String args[])
    {
        int a[]={3,5,1,87,33,4};
        insertion_recursion(a,0,a.length-1);
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
    public static void insertion_recursion(int a[],int f, int l)
    {
            if(f<l)
            {
                int j=f;
                while(j>=0)
                {
                    if(a[j]>a[j+1])
                    {
                        int t=a[j];
                        a[j]=a[j+1];
                        a[j+1]=t;
                    }
                    j--;     
                }        
                insertion_recursion(a,f+1,l);
            }
            else
            { 
                return;
            }
    }
    
}
