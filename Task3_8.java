/* Даны два числа x и y. Программа должна вывести в консоль YES, – если оба числа четные,
* либо оба числа нечетные; иначе программа ничего не выводит.
*/

import java.util.Scanner;

public class Task3_8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите первое число");
        System.out.print("x: ");
        int x = scn.nextInt();
        System.out.println("введите второе число");
        System.out.print("y: ");
        int y = scn.nextInt();
        scn.close();
        if ((x != 0) & (y != 0)) {
            if (EvenCzetNeCzet(x) & EvenCzetNeCzet(y)) System.out.println("YES!");
        }
    }
    private static boolean EvenCzetNeCzet(int a) {
        return a % 2 == 0;
    }
}
