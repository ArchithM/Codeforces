import java.util.Scanner;

public class RomanticGlasses
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++)
        {
            int n = sc.nextInt();
            int[] arr = new int[n + 1];
            for (int c = 1; c < n + 1; c++)
            {
                arr[c] = sc.nextInt();
            }
            solve(arr, n);
        }
    }
    public static boolean solve(int[] arr, int n)
    {
        int sumOdd = 0;
        int sumEven = 0;
        int i = 0;
        for (int d = 1; d < n - 3; d+=4)
        {
            sumOdd += arr[d] + arr[d + 2];
            sumEven += arr[d + 1] + arr[d + 3];
            if (arr[d] + 6 == 0)
            {
                return true;
            }
        }
        return false;
    }
}
