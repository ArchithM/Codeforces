import java.util.Scanner;
public class Elephant
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int count = 0;

        while (x >= 5)
        {
            x -= 5;
            count++;
        }
        while (x >= 4)
        {
            x -= 4;
            count++;
        }
        while (x >= 3)
        {
            x -= 3;
            count++;
        }
        while (x >= 2)
        {
            x -= 2;
            count++;
        }
        while (x >= 1)
        {
            x -= 1;
            count++;
        }
        System.out.println(count);
    }
}
