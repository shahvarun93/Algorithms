/**
 * Created by shahv on 5/6/2017.
 */
public class quick_sort {
    static int count=0;
    public static void main(String args[])
    {
        int a[]={1,1,1,1,1,1};
        quicksort(a,0,a.length-1);
        System.out.println("No. of comparisons "+count);
        for(int i: a)
            System.out.println(i);
    }
    public static void quicksort(int a[], int l, int r)
    {
        int m;
        if (l < r )
        {
            m=partition(a,l,r);
            quicksort(a,l,m-1);
            quicksort(a,m+1,r);
        }
    }
    public static int partition(int a[], int l, int r)
    {
        int i,j;
        int splitter=a[l];
        i=l; j=r;
        while(a[j]>splitter)
            j--;
        while(a[i]<splitter)
            i++;
        if(i<j)
        {
            count++;
            swap(a[i],a[j]);
        }
        return j;
    }
    public static void swap(int m, int n)
    {
        int temp=m;
        m=n;
        n=temp;
    }
}
