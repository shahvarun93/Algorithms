/**
 * Created by shahv on 4/25/2017.
 */
public class floyd_warshal {
    public static void main(String args[]) {
        int a[][] = new int[4][4];
        a[0][0] = 0;
        a[0][1] = 5;
        a[0][2] = Integer.MAX_VALUE;
        a[0][3] = 30;
        a[1][0] = Integer.MAX_VALUE;
        a[1][1] = 0;
        a[1][2] = 5;
        a[1][3] = 20;
        a[2][0] = Integer.MAX_VALUE;
        a[2][1] = Integer.MAX_VALUE;
        a[2][2] = 0;
        a[2][3] = 5;
        a[3][0] = Integer.MAX_VALUE;
        a[3][1] = Integer.MAX_VALUE;
        a[3][2] = Integer.MAX_VALUE;
        a[3][3] = 0;
        int d[][] = new int[4][4];
        for (int k = 0; k < 4; k++) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    d[i][j] = max(a[i][j], a[i][k] + a[k][j]);
                }
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(d[i][j]==Integer.MAX_VALUE)
                System.out.print("I\t");
                else
                System.out.print(d[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static int max(int a, int b) {
        if(a>b)
            return a;
        else
            return b;
    }
}