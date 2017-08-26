/**
 * Created by shahv on 5/6/2017.
 */
public class count_sort {
    public static void main(String args[]) {
        int a[] = {100,90,80,70,60,50,40,30,20,10,100};
        countsort(a, a.length, a[0]+1);
    }
    public static void countsort(int I[], int n, int k)
    {
        int C[]=new int [k];
        int O[]=new int [n];
        for (int i=0;i < k;i++)
        {
            C[i]=0;
        }
        for(int j=0;j<n;j++)
        {
            C[I[j]]++;
        }
        for(int i=1;i<k;i++)
        {
            C[i]=C[i]+C[i-1];
        }
        for(int j=n-1;j>=0;j--)
        {
            C[I[j]]--;
            O[C[I[j]]]=I[j];
        }
        for(int i:O)
        {
            System.out.println(i);
        }
    }
}
