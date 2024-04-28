import java.io.*;
import java.util.*;

public class Greetings {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][2];
            List<Integer> destination = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                a[i][0] = sc.nextInt();
                a[i][1] = sc.nextInt();
                destination.add(a[i][1]);
            }
            Collections.sort(destination);
            Arrays.sort(a,Comparator.comparingInt(arr->arr[0]));
            long count = 0;
            for(int i=0;i<n;i++)
            {
                int index = Collections.binarySearch(destination,a[i][1]);
                count += index;
                destination.remove(index);
            }
            System.out.println(count);
        }
    }
}

class FastScanner{
    BufferedReader br;
    StringTokenizer st;
    public FastScanner(){
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    public int nextInt(){
        return Integer.parseInt(next());
    }
    public long nextLong(){
        return Long.parseLong(next());
    }
    public String nextLine(){
        String str = "";
        try {
            str = br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }
    public double nextDouble(){
        return Double.parseDouble(next());
    }
    public String next(){
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
    public void close(){
        try {
            br.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
