import java.util.Scanner;

public class UnnaturalLanguage
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (; t > 0; t--)
        {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            char[] T = new char[1000000];
            int j = 0;
            for (int i = 0; i < n; i++)
            {
                if (i + 1 < n && i > 0)
                {
                    char c = s.charAt(i + 1);
                    if (c == 'a' || c == 'e')
                    {
                        T[j] = '.';
                        j++;
                    }
                }
                T[j] = s.charAt(i);
                j++;
            }
            for (int i = 0; i < j; i++)
                System.out.print(T[i]);
            System.out.println();
        }
    }
}
