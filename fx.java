import java.util.Scanner;
import static java.lang.Math.sin;

class fx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення a: ");
        double a = scanner.nextDouble();
        System.out.print("Введіть значення b: ");
        double b = scanner.nextDouble();

        // при х = [0, 5)
        for (double x = 5; x <= 12; x = +1) {
            double sin3x = Math.sin(3 * x);
            double fx = sin3x;
            System.out.println(" при х = [0, 5) f(x) дорівнює: " + fx);
            break;
        }
        // при х = 5
        double x = 5;
        double e = Math.E;
        double eax = Math.pow(e, (a * x) - 1);
        double twoeax = (2 * eax) + 1;
        double fx = twoeax;
        System.out.println(" при х = 5 f(x) дорівнює: " + fx);
    }
}