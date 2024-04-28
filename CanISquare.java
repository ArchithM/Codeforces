import java.util.Scanner;

public class CanISquare
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++)
        {
            long n = sc.nextLong();
            long sum = 0;
            for (int c = 0; c < n; c++)
            {
                long a = sc.nextLong();
                sum += a;
            }
            long x;
            x = (long) Math.sqrt(sum);
            if(x * x == sum)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }

        }
    }
}
