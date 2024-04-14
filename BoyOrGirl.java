import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BoyOrGirl
{
    public static void main(String[] args)
    {
        Scanner keyboard  = new Scanner(System.in);
        String input = keyboard.nextLine();

        String noDuplicates = Arrays.asList(input.split("")).stream().distinct().collect(Collectors.joining());

        if (noDuplicates.length() % 2 == 1)
        {
            System.out.println("IGNORE HIM!");
        }
        else
        {
            System.out.println("CHAT WITH HER!");
        }
    }
}
