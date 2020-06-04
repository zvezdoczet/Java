
import java.util.Scanner;

public class Task3_11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите коэффициент а квадратного уравнения: ");
        float a = scn.nextFloat();
        System.out.print("Введите коэффициент b квадратного уравнения: ");
        float b = scn.nextFloat();
        System.out.print("Введите коэффициент c квадратного уравнения: ");
        float c = scn.nextFloat();
        System.out.print("Итак решаем уравнение: ");
        System.out.printf("%sx*x + %sx + %s = 0.", a, b, c);
        float x1, x2, D;
        D = b * b - 4 * a * c;
        if (D < 0) System.out.println("\nВ решении уравнения нет корней.");
        else {
            if (D == 0) {
                System.out.println("\nВ решении уравнения один корень.");
                x1 = (-b / 2 / a);
                System.out.print("Решение уравнения: ");
                System.out.print("\nКорень уравнения: " + x1);
            }
            else {
                System.out.println("\nВ решении уравнения два корня.");
                System.out.print("Решение уравнения: Дискриминант = " + D);
                x1 = (float) (-b + Math.sqrt(D) / 2 / a);
                x2 = (float) (-b - Math.sqrt(D) / 2 / a);
                System.out.print("\nКорни уравнения: " + x1 + " ; " + x2);
            }
        }

    }
}
