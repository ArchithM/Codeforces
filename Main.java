import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++)
        {
            int n = scanner.nextInt();
            int[] num = new int[n];
            int count = 0;
            int[] cnt = new int[101];
            for (int c = 0; c < n; c++)
            {
                num[c] = scanner.nextInt();
            }
            if (n == 2 || n == 1)
            {
                System.out.println(0);
            }
            else
            {
                for (int d = 0; d < n; d++)
                {
                    for (int e = 0; e <= 100; e++)
                    {
                        if (num[d] == e)
                        {
                            cnt[e]++;
                        }
                    }
                }
                for (int f = 0; f <= 100; f++)
                {
                    cnt[f] = cnt[f] - (cnt[f] % 3);
                    count += (cnt[f] / 3);
                }
                System.out.println(count);
            }
        }
    }
}
