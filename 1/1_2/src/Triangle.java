import java.util.*;

public class Triangle {

    private static int n;

    public static void make_triangle()
    {
        for(int i = 0; i < n; i++)
        {
            for (int j = 0; j < n-i; j++)
            {
                System.out.print(" ");
            }

            for (int j = n-i; j <= n; j++)
            {
                System.out.print("#");
            }

            System.out.println();
        }
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }
}
