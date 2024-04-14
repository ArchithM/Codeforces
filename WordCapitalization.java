import java.util.Scanner;

public class WordCapitalization
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();

        System.out.println(input.substring(0,1).toUpperCase() + input.substring(1));
    }
}
