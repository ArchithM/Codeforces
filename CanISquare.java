import java.util.Scanner;

public class CanISquare
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++)
        {
            int n = sc.nextInt();
            int sum = 0;
            for (int c = 0; c < n; c++)
            {
                int a = sc.nextInt();
                sum += a;
            }
            int x = (int) Math.sqrt(sum);
            if(Math.pow(x,2) == sum)
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
