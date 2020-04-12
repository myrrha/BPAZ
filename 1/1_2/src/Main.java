import java.util.*;

public class Main {

    private static int n;
    private static Scanner scanner;
    private static Triangle triangle_obj;

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

            //make_triangle();

            triangle_obj = new Triangle();

            triangle_obj.setN(n);
            triangle_obj.make_triangle();

        }
        catch (java.util.InputMismatchException e)
        {
            scanner.nextLine();
        }

    }

}
