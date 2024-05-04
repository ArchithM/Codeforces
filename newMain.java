import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class newMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> num = new ArrayList<Integer>();
            int[] num1 = new int[n];
            for (int c = 0; c < n; c++)
            {
                int b = sc.nextInt();
                num.add(b);
                num1[c] = b;
            }
            boolean visited[] = new boolean[n];
            int[] freq = new int[n];
            Arrays.fill(visited, false);
            for (int z = 0; z < n; z++) {
                if (visited[z] == true)
                    continue;
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (num1[i] == num1[j]) {
                        visited[j] = true;
                        count++;
                    }
                }
                freq[z] = count;
            }
            if (Arrays.stream(num1).distinct().toArray().length == num1.length || k > n || check(freq, k, num1.length) || num1.length <= 1)
            {
                System.out.println(num1.length);
            }
            else
            {
                System.out.println(k - 1);
            }
        }
    }
    public static boolean check(int[] freq, int k, int n)
    {
        int count = 0;
        for (int i = 0; i < freq.length; i++)
        {
            if (freq[i] >= k)
            {
                return true;
            }
        }

        return false;
    }
}
