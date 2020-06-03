/* Даны координаты начала и координаты конца отрезка. Если считать отрезок
 * обозначением горки, то в одном случае он обозначает спуск, в другом – подъем.
 * Определить и вывести на экран – спуск это или подъем, ровная дорога или вообще отвесная.
*/

import java.util.Scanner;

public class Task3_9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите начальную точку");
        System.out.print("x1: ");
        float x1 = scn.nextFloat();
        System.out.print("y1: ");
        float y1 = scn.nextFloat();
        System.out.println("введите конечную точку");
        System.out.print("x2: ");
        float x2 = scn.nextFloat();
        System.out.print("y2: ");
        float y2 = scn.nextFloat();
        System.out.println(x1 + "," + y1 + " ; " + x2 + "," + y2);
        if ((x1 == y1) & (x1 == x2) & (x2 == y2)) System.out.println("начало дороги есть ее конец.");
        if ((y1 == y2) & (x1 != x2)) System.out.println("дорога впереди ровная.");
        if ((x1 < x2) & (y1 < y2)) System.out.println("дорога впереди с подъемом.");
        if ((x1 < x2) & (y1 > y2)) System.out.println("дорога впереди со спуском.");
        if ((x1 == x2) & (y1 != y2)) System.out.println("дорога отвесная.");
    }
}
