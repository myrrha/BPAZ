import java.util.*;
import java.util.logging.Logger;

public class Main {

    private static int n;
    private static Scanner scanner;
    private static Logger logger;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        logger = Logger.getLogger("newLog");

        Thread thread = new Thread(() -> read_data());
        thread.start();

    }

    public static void read_data()
    {
        logger.info("���������� ������ ������.");
        try
        {
            n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            logger.info("���������� ������ ���������.");

            make_triangle();

        }
        catch (java.util.InputMismatchException e)
        {
            logger.info("������ ��� ���������� ������. ������� ������������ ��������.");
            scanner.nextLine();
        }

    }

    public static void make_triangle()
    {
        logger.info("���������� ������������.");
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
        logger.info("����������� ��������.");
    }

    public void setN(int n) {
        this.n = n;
        logger.info("����������� ����� �������� ��� �������� n");
    }

    public int getN() {
        logger.info("��������� �������� �������� n");
        return n;
    }
}
