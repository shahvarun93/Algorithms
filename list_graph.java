import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.*;

/**
 * Created by shahv on 4/23/2017.
 */
public class list_graph {
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(new File("samplegraph.txt"));
            int n = sc.nextInt();
            int m = sc.nextInt();
            HashMap<Integer, LinkedList<Integer>> h = new HashMap<Integer, LinkedList<Integer>>();
            while (sc.hasNext()) {
                LinkedList<Integer> l = new LinkedList<Integer>();
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (h.containsKey(a)) {
                    l.addAll(h.get(a));
                }
                l.addLast(b);
                h.put(a, l);
            }
            Set s = h.entrySet();
            Iterator i = s.iterator();
            while (i.hasNext()) {
                Map.Entry me = (Map.Entry) i.next();
                System.out.println(me.getKey() + ":" + me.getValue());
            }
            boolean b[]=new boolean[n];
            for(int j=0;j<n;j++)
            {
                b[j]=false;
            }
            dfs(h,b);
        } catch (Exception e) {
        }
    }
    public static void dfs(HashMap h, boolean b[])
    {
    }
}
