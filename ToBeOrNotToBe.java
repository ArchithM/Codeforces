import java.util.Scanner;

public class ToBeOrNotToBe
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        if (s.indexOf("be") > -1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
