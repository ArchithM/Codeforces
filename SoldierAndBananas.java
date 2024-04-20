import java.util.Scanner;
public class SoldierAndBananas
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int cost = sc.nextInt();
        int init = sc.nextInt();
        int num = sc.nextInt();
        int k = 1;
        int total = 0;
        for (int i = 1; i <= num; i++)
        {
            total = total + cost * k;
            k++;
        }

        if(total <= init)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(total - init);
        }
    }
}
