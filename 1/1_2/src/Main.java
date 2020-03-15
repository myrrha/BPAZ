import java.util.*;

public class Main {

    private static int n;
    private static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        read_data();

    }

    public static void read_data()
    {
        try
        {
            n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            make_triangle();
        }
        catch (java.util.InputMismatchException e)
        {
            scanner.nextLine();
        }

    }

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
