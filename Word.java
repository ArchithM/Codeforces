import java.util.Scanner;
public class Word
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (char c : s.toCharArray())
        {
            if (Character.isUpperCase(c))
            {
                count++;
            }
        }
        if (count > (s.length() / 2))
        {
            System.out.println(s.toUpperCase());
        }
        else
        {
            System.out.println(s.toLowerCase());
        }

    }
}
