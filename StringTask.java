import java.util.Scanner;

public class StringTask
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine().toLowerCase();
        String newString = input.replaceAll("[aeiouy]", "");
        for (int i = 0; i < newString.length(); i++)
        {
            System.out.print("." + newString.charAt(i));
        }
    }
}
