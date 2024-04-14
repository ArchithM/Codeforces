import java.util.Scanner;
import java.util.Arrays;
public class HelpfulMaths
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        String expression = keyboard.nextLine();
        String[] arr = expression.split("\\+");

        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            newArr[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(newArr);

        for (int i = 0; i < newArr.length - 1; i++)
        {
            System.out.print(newArr[i] + "+");
        }

        System.out.print(newArr[newArr.length - 1]);
    }
}
