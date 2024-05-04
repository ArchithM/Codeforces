import java.util.Scanner;

public class KthNotDivisibleByN
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++)
        {
            long n = sc.nextInt();
            long k = sc.nextInt();
            System.out.println(solveNum(n, k));
        }
    }

    public static long solveNum(long n, long k)
    {
        long count = 0;
        for (long c = 1; c < (long)(Math.pow(10, 9)); c++)
        {
            if (c % n != 0)
            {
                count++;
            }
            if (count == k)
            {
                return c;
            }
        }
        return 1;
    }
}
