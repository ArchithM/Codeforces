import java.util.Scanner;
public class YogurtSale
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] yogurt = new int[t + 1][3];
        int b = 0;
        for (int i = 0; 0 < t; i++)
        {
            for (int c = 0; c < 3; c++)
            {
                yogurt[i][c] = sc.nextInt();
            }
            if ((yogurt[i][1] * 2) <= yogurt[i][2])
            {
                System.out.println(yogurt[i][1] * yogurt[i][0]);
            }
            else
            {
                while (yogurt[i][0] >= 2)
                {
                    b += yogurt[i][2];
                    yogurt[i][0] -= 2;
                }
                while (yogurt[i][0] > 0)
                {
                    b += yogurt[i][1];
                    yogurt[i][0] -= 1;
                }
                System.out.println(b);
            }
        }
    }
}
