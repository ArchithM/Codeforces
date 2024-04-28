import java.util.Scanner;

public class NotQuiteLatinSquare
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++)
        {
            String a = sc.next();
            String b = sc.next();
            String c = sc.next();

            if (a.contains("?"))
            {
                if (a.contains("B") && a.indexOf("C") != -1)
                {
                    System.out.println("A");
                }
                else if (a.indexOf("A") != -1 && a.indexOf("B") != -1)
                {
                    System.out.println("C");
                }
                else
                {
                    System.out.println("B");
                }
            }
            else if (b.indexOf("?") != -1)
            {
                if (b.indexOf("B") != -1 && b.indexOf("C") != -1)
                {
                    System.out.println("A");
                }
                else if (b.indexOf("A") != -1 && b.indexOf("B") != -1)
                {
                    System.out.println("C");
                }
                else
                {
                    System.out.println("B");
                }
            }
            else if (c.indexOf("?") != -1)
            {
                if (c.indexOf("B") != -1 && c.indexOf("C") != -1)
                {
                    System.out.println("A");
                }
                else if (c.indexOf("A") != -1 && c.indexOf("B") != -1)
                {
                    System.out.println("C");
                }
                else
                {
                    System.out.println("B");
                }
            }
        }
    }
}
