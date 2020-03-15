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
        logger.info("Считывание данных начато.");
        try
        {
            n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            logger.info("Считывание данных закончено.");

            make_triangle();

        }
        catch (java.util.InputMismatchException e)
        {
            logger.info("Ошибка при считывание данных. Введено некорректное значение.");
            scanner.nextLine();
        }

    }

    public static void make_triangle()
    {
        logger.info("Построение треугольника.");
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
        logger.info("Треугольник построен.");
    }

    public void setN(int n) {
        this.n = n;
        logger.info("Установлено новое значение для атрибута n");
    }

    public int getN() {
        logger.info("Запрошено значение атрибута n");
        return n;
    }
}
