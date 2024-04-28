import java.util.Scanner;

public class OddOneOut
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (b == c)
            {
                System.out.println(a);
            }
            else if (a == b)
            {
                System.out.println(c);
            }
            else
            {
                System.out.println(b);
            }
        }
    }
}
