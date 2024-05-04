import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class mixmilk {

    final public static int NUMBUCKETS = 3;
    final public static int NUMPOURS = 100;

    public static void main(String[] args) throws Exception {

        Scanner stdin = new Scanner(new File("mixmilk.in"));
        int[] cap = new int[NUMBUCKETS];
        int[] milk = new int[NUMBUCKETS];

        for (int i=0; i<NUMBUCKETS; i++) {
            cap[i] = stdin.nextInt();
            milk[i] = stdin.nextInt();
        }

        for (int i=0; i<NUMPOURS; i++) {

            int from = i%NUMBUCKETS;
            int to = (i+1)%NUMBUCKETS;

            int transfer = Math.min(milk[from], cap[to]-milk[to]);

            milk[from] -= transfer;
            milk[to] += transfer;
        }

        PrintWriter out = new PrintWriter(new FileWriter("mixmilk.out"));
        for (int i=0; i<NUMBUCKETS; i++)
            out.println(milk[i]);
        out.close();
        stdin.close();
    }
}