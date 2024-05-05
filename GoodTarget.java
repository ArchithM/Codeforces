import java.util.Scanner;

public class GoodTarget
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (; t > 0; t--)
        {
            double n = (double) sc.nextInt();
            System.out.println((int) Math.ceil(n / 6) + " " + (int) Math.ceil(n / 4));
        }
    }
}
