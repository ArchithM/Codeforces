import java.util.Scanner;
public class YogurtSale
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] yog = new int[t][3];
        for (int i = 0; i < t; i++)
        {
            for (int c = 0; c < 3; c++)
            {
                yog[i][c] = sc.nextInt();
            }
            if (yog[i][0] % 2 == 0) {
                System.out.println(Math.min(yog[i][0] * yog[i][1], yog[i][0] / 2 * yog[i][2]));
            } else {
                System.out.println(Math.min(yog[i][0] * yog[i][1], (yog[i][0] - 1) / 2 * yog[i][2] + yog[i][1]));
            }
        }
    }
}
