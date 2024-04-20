import java.util.Scanner;

public class StonesOnTheTable
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        String s = keyboard.next();

        int count = 0;
        for (int i = 0; i < n - 1; i++)
        {
            if (s.charAt(i) == s.charAt(i + 1))
            {
                count++;
            }
        }
        System.out.println(count);
    }

}
