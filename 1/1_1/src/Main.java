import java.util.*;

public class Main {

    static void func1(int n) {
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

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try
        {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            func1(n);
        }
        catch (java.util.InputMismatchException e)
        {
            scanner.nextLine();
        }

    }
}
