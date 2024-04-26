import java.util.Scanner;

public class NextRound
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;
        int place = -1;
        for (int i = 0; i < n; i++)
        {
            int a = scanner.nextInt();
            if (a > 0)
            {
                if (i == (k - 1))
                {
                    count += k;
                    place = a;
                }
                else if (a == place)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
