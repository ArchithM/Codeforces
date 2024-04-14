import java.util.Scanner;
public class BeautifulMatrix
{
    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);
        int oneRow = 0;
        int oneCol = 0;
        int[][] matrix  = new int[5][5];

        for (int i = 0; i < matrix.length; i++)
        {
            for (int z = 0; z < matrix[0].length; z++)
            {
                matrix[i][z] = ip.nextInt();
                if (matrix[i][z] == 1)
                {
                    oneRow = i;
                    oneCol = z;
                }
            }
        }

        System.out.println((Math.abs(oneRow - 2)) + (Math.abs(oneCol - 2)));
    }
}
