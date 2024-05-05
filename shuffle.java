import java.util.Scanner;

public class shuffle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[] order = new int[t];
        int[] id = new int[t];
        for (int i = 0; i < t; i++)
        {
            order[i] = sc.nextInt();
        }
        for (int b = 0; b < t; b++)
        {
            id[b] = sc.nextInt();
        }
        for (int n : order)
        {
            System.out.println(id[n - 1]);
        }
    }
}
