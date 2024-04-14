import java.util.Scanner;
public class PetyaAndStrings
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String word1 = keyboard.nextLine().toLowerCase();
        String word2 = keyboard.nextLine().toLowerCase();

        if (word1.compareTo(word2) > 0)
        {
            System.out.println(1);
        }
        else if (word1.compareTo(word2) < 0)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(0);
        }

    }
}
