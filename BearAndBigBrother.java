import java.util.Scanner;

public class BearAndBigBrother
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int cnt  = 0;
        while (a <= b)
        {
            a *= 3;
            b *= 2;
            cnt++;
        }

        System.out.println(cnt);
    }
}
