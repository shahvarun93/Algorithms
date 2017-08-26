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
public class insertion_sort {
    public static void main(String args[])
    {
        int a[]={5,4,3,2,1,99};
        insertion(a,a.length-1);
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
    public static void insertion(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            int j=i;
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
            
        }
    }
    
}
